package com.example.learnenglish.ui.main.grammar;

import android.os.Bundle;
import android.view.DragEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.learnenglish.R;

public class PunctuationActivity extends AppCompatActivity {

    private String[] correctPunctuation = {",", ",", ",", ".", ":", ",", ",", "\"", ",", ".", ".", "."};
    private TextView[] punctuationMarks;

    private String[] textSegments;
    private TextView[] segmentTextViews;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_punctuation);

        // Initialize arrays for text segments and punctuation marks
        //textSegments = getResources().getStringArray(R.array.text_segments);
        punctuationMarks = new TextView[correctPunctuation.length];

        // Find TextViews for punctuation marks
        for (int i = 0; i < correctPunctuation.length; i++) {
            int punctuationId = getResources().getIdentifier("punctuation" + (i + 1), "id", getPackageName());
            punctuationMarks[i] = findViewById(punctuationId);
            punctuationMarks[i].setOnTouchListener(new PunctuationTouchListener());
        }

        // Find TextViews for text segments
        segmentTextViews = new TextView[textSegments.length];
        for (int i = 0; i < textSegments.length; i++) {
            int segmentId = getResources().getIdentifier("segment" + (i + 1), "id", getPackageName());
            segmentTextViews[i] = findViewById(segmentId);
            segmentTextViews[i].setOnDragListener(new PunctuationDragListener());
        }

        // Set onClickListener for the submit button
        Button submitButton = findViewById(R.id.submitButton);
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkPunctuation();
            }
        });
    }

    private class PunctuationTouchListener implements View.OnTouchListener {
        @Override
        public boolean onTouch(View v, MotionEvent event) {
            if (event.getAction() == MotionEvent.ACTION_DOWN) {
                // Start dragging the punctuation mark
                View.DragShadowBuilder shadowBuilder = new View.DragShadowBuilder(v);
                v.startDragAndDrop(null, shadowBuilder, v, 0);
                return true;
            } else {
                return false;
            }
        }
    }

    private class PunctuationDragListener implements View.OnDragListener {
        @Override
        public boolean onDrag(View v, DragEvent event) {
            int action = event.getAction();
            switch (action) {
                case DragEvent.ACTION_DROP:
                    // Handle the drop event
                    TextView droppedView = (TextView) event.getLocalState();
                    TextView targetView = (TextView) v;

                    // Swap the text between the dropped and target TextViews
                    CharSequence droppedText = droppedView.getText();
                    CharSequence targetText = targetView.getText();
                    droppedView.setText(targetText);
                    targetView.setText(droppedText);
                    break;
            }
            return true;
        }
    }

    private void checkPunctuation() {
        StringBuilder userPunctuation = new StringBuilder();
        for (TextView segmentTextView : segmentTextViews) {
            userPunctuation.append(segmentTextView.getText());
        }

        boolean correct = true;
        for (int i = 0; i < correctPunctuation.length; i++) {
            if (!userPunctuation.toString().contains(correctPunctuation[i])) {
                correct = false;
                break;
            }
        }

        if (correct) {
            Toast.makeText(this, "Correct punctuation!", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Incorrect punctuation!", Toast.LENGTH_SHORT).show();
        }
    }
}
