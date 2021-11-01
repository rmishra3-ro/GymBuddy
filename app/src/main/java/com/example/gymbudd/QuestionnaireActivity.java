package com.example.gymbudd;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

public class QuestionnaireActivity extends AppCompatActivity {

    Button button_Submit;

    private Spinner spinnerAge;
    private Spinner spinnerGender;
    private Spinner spinnerFitnessGoal;
    private Spinner spinnerGymFreq;
    private Spinner spinnerGymProgramInterest;
    private Spinner spinnerGymTiming;
    private Spinner spinnerSameGender;
    private Spinner spinnerInterestPT;
    private Spinner spinnerGymSession;
    private Spinner spinnerEquipmentFamiliar;
    private Spinner spinnerHadWorkoutPartner;
    private Spinner spinnerRate;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questionnaire);

        spinnerAge = findViewById(R.id.spinnerAge);
        spinnerGender = findViewById(R.id.spinnerGender);
        spinnerFitnessGoal = findViewById(R.id.spinnerFitnessGoals);
        spinnerGymFreq = findViewById(R.id.spinnerGymFreq);
        spinnerGymProgramInterest = findViewById(R.id.spinnerGymProgramInterest);
        spinnerGymTiming = findViewById(R.id.spinnerGymTiming);
        spinnerSameGender = findViewById(R.id.spinnerSameGender);
        spinnerInterestPT = findViewById(R.id.spinnerInterestPT);
        spinnerGymSession = findViewById(R.id.spinnerGymSession);
        spinnerEquipmentFamiliar = findViewById(R.id.spinnerEquipmentFamiliar);
        spinnerHadWorkoutPartner = findViewById(R.id.spinnerHadWorkoutPartner);
        spinnerRate = findViewById(R.id.spinnerRate);
        button_Submit = (Button) findViewById(R.id.submitQuestionnaire) ;

        String[] userAges = getResources().getStringArray(R.array.ages);
        ArrayAdapter adapter1 = new ArrayAdapter(this,android.R.layout.simple_spinner_item, userAges);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerAge.setAdapter(adapter1);

        String[] userGenders = getResources().getStringArray(R.array.genders);
        ArrayAdapter adapter2 = new ArrayAdapter(this,android.R.layout.simple_spinner_item, userGenders);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerGender.setAdapter(adapter2);

        String[] userFitnessGoal = getResources().getStringArray(R.array.fitness_goals);
        ArrayAdapter adapter3 = new ArrayAdapter(this,android.R.layout.simple_spinner_item, userFitnessGoal);
        adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerFitnessGoal.setAdapter(adapter3);

        String[] userGymFreq = getResources().getStringArray(R.array.frequency_gym);
        ArrayAdapter adapter4 = new ArrayAdapter(this,android.R.layout.simple_spinner_item, userGymFreq);
        adapter4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerGymFreq.setAdapter(adapter4);

        String[] userGymProgramInterest = getResources().getStringArray(R.array.gymprogram_interest);
        ArrayAdapter adapter5 = new ArrayAdapter(this,android.R.layout.simple_spinner_item, userGymProgramInterest);
        adapter5.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerGymProgramInterest.setAdapter(adapter5);

        String[] userGymTiming = getResources().getStringArray(R.array.gym_timing);
        ArrayAdapter adapter6 = new ArrayAdapter(this,android.R.layout.simple_spinner_item, userGymTiming);
        adapter6.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerGymTiming.setAdapter(adapter6);

        String[] userSameGender = getResources().getStringArray(R.array.same_gender);
        ArrayAdapter adapter7 = new ArrayAdapter(this,android.R.layout.simple_spinner_item, userSameGender);
        adapter7.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerSameGender.setAdapter(adapter7);

        String[] userInterestPT = getResources().getStringArray(R.array.PT_interest);
        ArrayAdapter adapter8 = new ArrayAdapter(this,android.R.layout.simple_spinner_item, userInterestPT);
        adapter8.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerInterestPT.setAdapter(adapter8);

        String[] userGymSession = getResources().getStringArray(R.array.gym_session);
        ArrayAdapter adapter9 = new ArrayAdapter(this,android.R.layout.simple_spinner_item, userGymSession);
        adapter9.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerGymSession.setAdapter(adapter9);

        String[] userEquipmentFamiliar = getResources().getStringArray(R.array.equipment_familiar);
        ArrayAdapter adapter10 = new ArrayAdapter(this,android.R.layout.simple_spinner_item, userEquipmentFamiliar);
        adapter10.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerEquipmentFamiliar.setAdapter(adapter10);

        String[] userHadWorkoutPartner = getResources().getStringArray(R.array.had_partner);
        ArrayAdapter adapter11 = new ArrayAdapter(this,android.R.layout.simple_spinner_item, userHadWorkoutPartner);
        adapter11.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerHadWorkoutPartner.setAdapter(adapter11);

        String[] userRate = getResources().getStringArray(R.array.rates);
        ArrayAdapter adapter12 = new ArrayAdapter(this,android.R.layout.simple_spinner_item, userRate);
        adapter12.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerRate.setAdapter(adapter12);

        button_Submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });


    }
}