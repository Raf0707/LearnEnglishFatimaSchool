package com.example.learnenglish.ui.main.grammar;

import android.content.pm.ActivityInfo;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.learnenglish.R;
import com.example.learnenglish.databinding.ActivityInfoTensesBinding;

public class InfoTensesActivity extends AppCompatActivity {
    ActivityInfoTensesBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        binding = ActivityInfoTensesBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        String tenseName = getIntent().getStringExtra("tense");

        switch (tenseName) {
            case "Present Simple":
                binding.titleTense.setText("Present Simple (настоящее простое время)");
                binding.descriptTense.setText("Описание: Настоящее простое время используется для выражения постоянных фактов, общепринятых истин и регулярных действий.");
                binding.schemeTense.setText("Схема предложения:\n" +
                        "\n" +
                        "Положительная форма: Субъект + глагол в основной форме (без окончания -s/-es для третьего лица единственного числа).\n" +
                        "Отрицательная форма: Субъект + do/does + not + глагол в основной форме.\n" +
                        "Вопросительная форма: Do/Does + субъект + глагол в основной форме?");
                binding.examplesTense.setText("Примеры:\n" +
                        "She speaks English well. \n (Она хорошо говорит по-английски.)\n" +
                        "They live in New York. \n (Они живут в Нью-Йорке.)\n" +
                        "He does not play tennis. \n (Он не играет в теннис.)\n" +
                        "Do you like pizza? \n (Ты любишь пиццу?)");

            case "Present Continuous":
                binding.titleTense.setText("Present Continuous (настоящее продолженное время)");
                binding.descriptTense.setText("Описание: Настоящее продолженное время используется для выражения действий, которые происходят в момент речи или в данный момент времени.");
                binding.schemeTense.setText("Схема предложения:\n" +
                        "\n" +
                        "Положительная форма: Субъект + to be (am/is/are) + глагол с окончанием -ing.\n" +
                        "Отрицательная форма: Субъект + to be (am/is/are) + not + глагол с окончанием -ing.\n" +
                        "Вопросительная форма: To be (am/is/are) + субъект + глагол с окончанием -ing?");
                binding.examplesTense.setText("Примеры:\n" +
                        "She is reading a book now. \n(Она сейчас читает книгу.)\n" +
                        "They are watching TV at the moment. \n(Они сейчас смотрят телевизор.)\n" +
                        "He is not sleeping. \n(Он не спит.)\n" +
                        "Is she cooking dinner? \n(Она готовит ужин?)");

            case "Present Perfect":
                binding.titleTense.setText("Present Perfect (настоящее совершенное время)");
                binding.descriptTense.setText("Описание: Настоящее совершенное время используется для описания действий, которые произошли в прошлом, но имеют связь с настоящим.");
                binding.schemeTense.setText("Схема предложения:\n" +
                        "\n" +
                        "Положительная форма: Субъект + have/has + глагол в третьей форме.\n" +
                        "Отрицательная форма: Субъект + have/has + not + глагол в третьей форме.\n" +
                        "Вопросительная форма: Have/Has + субъект + глагол в третьей форме?");
                binding.examplesTense.setText("Примеры:\n" +
                        "She has visited Paris many times. \n(Она много раз бывала в Париже.)\n" +
                        "They have not finished their homework yet. \n(Они еще не закончили свою домашнюю работу.)\n" +
                        "He has already eaten lunch. \n(Он уже пообедал.)\n" +
                        "Have you ever been to London? \n(Ты когда-нибудь был в Лондоне?)\n");

            case "Present Perfect Continuous":
                binding.titleTense.setText("Present Perfect Continuous (настоящее совершенное длительное время)");
                binding.descriptTense.setText("Описание: Настоящее совершенное длительное время используется для описания действий, которые начались в прошлом и продолжаются в настоящем, или для выражения длительных действий, которые только что завершились.");
                binding.schemeTense.setText("Схема предложения:\n" +
                        "\n" +
                        "Положительная форма: Субъект + have/has + been + глагол с окончанием -ing.\n" +
                        "Отрицательная форма: Субъект + have/has + not + been + глагол с окончанием -ing.\n" +
                        "Вопросительная форма: Have/Has + субъект + been + глагол с окончанием -ing?\n");
                binding.examplesTense.setText("Примеры:\n" +
                        "She has been studying English for two hours. \n(Она учит английский два часа.)\n" +
                        "They have not been waiting for you long. \n(Они не долго ждали тебя.)\n" +
                        "He has been working in the garden all morning. \n(Он работает в саду всё утро.)\n" +
                        "Have you been watching TV since morning? \n(Ты смотришь телевизор с утра?)");

            case "Past Simple":
                binding.titleTense.setText("Past Simple (прошедшее простое время)");
                binding.descriptTense.setText("Описание: Прошедшее простое время используется для описания действий, которые произошли в определенный момент в прошлом.");
                binding.schemeTense.setText("Схема предложения:\n" +
                        "\n" +
                        "Положительная форма: Субъект + глагол во второй форме.\n" +
                        "Отрицательная форма: Субъект + did not (didn't) + глагол в первой форме.\n" +
                        "Вопросительная форма: Did + субъект + глагол в первой форме?\n");
                binding.examplesTense.setText("Примеры:\n" +
                        "She visited her grandparents last weekend. \n(Она навестила своих бабушку и дедушку на прошлых выходных.)\n" +
                        "They didn't go to the party yesterday. \n(Они не ходили на вечеринку вчера.)\n" +
                        "He played football when he was a child. \n(Он играл в футбол, когда был ребенком.)\n" +
                        "Did you finish your homework? \n(Ты закончил свою домашнюю работу?)");

            case "Past Continuous":
                binding.titleTense.setText("Past Continuous (прошедшее продолженное время)");
                binding.descriptTense.setText("Описание: Прошедшее продолженное время используется для описания действий, которые происходили в определенный момент в прошлом.");
                binding.schemeTense.setText("Схема предложения:\n" +
                        "\n" +
                        "Положительная форма: Субъект + was/were + глагол с окончанием -ing.\n" +
                        "Отрицательная форма: Субъект + was/were + not + глагол с окончанием -ing.\n" +
                        "Вопросительная форма: Was/Were + субъект + глагол с окончанием -ing?\n");
                binding.examplesTense.setText("Примеры:\n" +
                        "She was cooking dinner at 7 p.m. yesterday. \n(Она готовила ужин в 7 вечера вчера.)\n" +
                        "They were not watching TV when you called. \n(Они не смотрели телевизор, когда ты звонил.)\n" +
                        "He was sleeping when the phone rang. \n(Он спал, когда зазвонил телефон.)\n" +
                        "Were you studying English at this time yesterday? \n(Ты учил английский в это время вчера?)\n");

            case "Past Perfect":
                binding.titleTense.setText("Past Perfect (прошедшее совершенное время)");
                binding.descriptTense.setText("Описание: Прошедшее совершенное время используется для описания действия, которое произошло до определенного момента в прошлом.");
                binding.schemeTense.setText("Схема предложения:\n" +
                        "\n" +
                        "Положительная форма: Субъект + had + глагол в третьей форме.\n" +
                        "Отрицательная форма: Субъект + had + not + глагол в третьей форме.\n" +
                        "Вопросительная форма: Had + субъект + глагол в третьей форме?\n");
                binding.examplesTense.setText("Примеры:\n" +
                        "She had finished her work before they arrived. \n(Она закончила свою работу до их прихода.)\n" +
                        "They hadn't eaten dinner when we left. \n(Они не поужинали, когда мы ушли.)\n" +
                        "He had already left when I got there. \n(Он уже ушел, когда я пришел туда.)\n" +
                        "Had you ever been to Paris before your last trip? \n(Ты когда-либо был в Париже до своей последней поездки?)\n");

            case "Past Perfect Continuous":
                binding.titleTense.setText("Past Perfect Continuous (прошедшее совершенное длительное время)");
                binding.descriptTense.setText("Описание: Прошедшее совершенное длительное время используется для описания длительных действий, которые происходили до определенного момента в прошлом и продолжались в течение некоторого времени.");
                binding.schemeTense.setText("Схема предложения:\n" +
                        "\n" +
                        "Положительная форма: Субъект + had + been + глагол с окончанием -ing.\n" +
                        "Отрицательная форма: Субъект + had + not + been + глагол с окончанием -ing.\n" +
                        "Вопросительная форма: Had + субъект + been + глагол с окончанием -ing?\n");
                binding.examplesTense.setText("Примеры:\n" +
                        "She had been working at the company for five years before she quit. \n(Она работала в компании пять лет, прежде чем уволиться.)\n" +
                        "They hadn't been waiting for us for too long when we arrived. \n(Они не слишком долго нас ждали, когда мы приехали.)\n" +
                        "He had been studying English for six months before he took the exam. \n(Он учил английский шесть месяцев, прежде чем сдать экзамен.)\n" +
                        "Had you been practicing piano before you gave that performance? \n(Ты практиковал игру на пианино, прежде чем дать это выступление?)");

            case "Future Simple":
                binding.titleTense.setText("Future Simple (будущее простое время)");
                binding.descriptTense.setText("Описание: Будущее простое время используется для выражения действий, которые произойдут в будущем и не зависят от других обстоятельств.");
                binding.schemeTense.setText("Схема предложения:\n" +
                        "\n" +
                        "Положительная форма: Субъект + will + глагол в первой форме.\n" +
                        "Отрицательная форма: Субъект + will + not (won't) + глагол в первой форме.\n" +
                        "Вопросительная форма: Will + субъект + глагол в первой форме?\n");
                binding.examplesTense.setText("Примеры:\n" +
                        "She will finish her work by tomorrow. \n(Она закончит свою работу к завтрашнему дню.)\n" +
                        "They won't come to the party next week. \n(Они не придут на вечеринку на следующей неделе.)\n" +
                        "He will call you when he arrives. \n(Он позвонит тебе, когда приедет.)\n" +
                        "Will you go to the cinema with me tomorrow? \n(Ты пойдешь со мной в кино завтра?)\n");

            case "Future Continuous":
                binding.titleTense.setText("Future Continuous (будущее продолженное время)");
                binding.descriptTense.setText("Описание: Будущее продолженное время используется для выражения действий, которые будут происходить в определенный момент в будущем и будут продолжаться в течение какого-то времени.\n");
                binding.schemeTense.setText("Схема предложения:\n" +
                        "\n" +
                        "Положительная форма: Субъект + will be + глагол с окончанием -ing.\n" +
                        "Отрицательная форма: Субъект + will + not (won't) + be + глагол с окончанием -ing.\n" +
                        "Вопросительная форма: Will + субъект + be + глагол с окончанием -ing?\n");
                binding.examplesTense.setText("Примеры:\n" +
                        "She will be studying when you arrive. \n(Она будет учиться, когда ты придешь.)\n" +
                        "They won't be waiting for us at the station. \n(Они не будут ждать нас на станции.)\n" +
                        "He will be working late tonight. \n(Он будет работать поздно сегодня вечером.)\n" +
                        "Will you be watching the football match tomorrow evening? \n(Ты будешь смотреть футбольный матч завтра вечером?)");

            case "Future Perfect":
                binding.titleTense.setText("Future Perfect (будущее совершенное время)");
                binding.descriptTense.setText("Описание: Будущее совершенное время используется для описания действия, которое будет завершено к определенному моменту в будущем.");
                binding.schemeTense.setText("Схема предложения:\n" +
                        "\n" +
                        "Положительная форма: Субъект + will have + глагол в третьей форме.\n" +
                        "Отрицательная форма: Субъект + will + not (won't) + have + глагол в третьей форме.\n" +
                        "Вопросительная форма: Will + субъект + have + глагол в третьей форме?\n");
                binding.examplesTense.setText("Примеры:\n" +
                        "\n" +
                        "She will have finished her homework by the time you come. \n(Она закончит свою домашнюю работу к тому времени, когда ты придешь.)\n" +
                        "They won't have left by the time we arrive. \n(Они не уйдут к тому времени, когда мы приедем.)\n" +
                        "He will have completed the project by the end of the month. \n(Он завершит проект к концу месяца.)\n" +
                        "Will you have graduated from university by next year? \n(Ты закончишь университет к следующему году?)");

            case "Future Perfect Continuous":
                binding.titleTense.setText("Future Perfect Continuous (будущее совершенное продолженное время)");
                binding.descriptTense.setText("Описание: Будущее совершенное продолженное время используется для описания длительного действия, которое начнется до определенного момента в будущем и будет продолжаться в течение некоторого времени.");
                binding.schemeTense.setText("Схема предложения:\n" +
                        "\n" +
                        "Положительная форма: Субъект + will have been + глагол с окончанием -ing.\n" +
                        "Отрицательная форма: Субъект + will + not (won't) + have been + глагол с окончанием -ing.\n" +
                        "Вопросительная форма: Will + субъект + have been + глагол с окончанием -ing?\n");
                binding.examplesTense.setText("Примеры:\n" +
                        "She will have been studying English for two hours by the time you arrive. \n(Она будет изучать английский два часа к тому времени, когда ты приедешь.)\n" +
                        "They won't have been waiting for us for too long by the time we get there. \n(Они не будут слишком долго нас ждать, когда мы приедем туда.)\n" +
                        "He will have been working on the project for three months by next week. \n(Он будет работать над проектом три месяца к следующей неделе.)\n" +
                        "Will you have been living here for a year by the end of the month? \n(Ты будешь жить здесь год к концу месяца?)");


        }
    }
}