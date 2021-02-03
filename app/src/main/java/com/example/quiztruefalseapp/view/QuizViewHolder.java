package com.example.quiztruefalseapp.view;

import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.quiztruefalseapp.R;


public class QuizViewHolder extends RecyclerView.ViewHolder {
    private TextView txtQuizQuestions;
    private ImageButton imgTrue;
    private ImageButton imgFalse;
    public QuizViewHolder(@NonNull View itemView) {
        super(itemView);

        txtQuizQuestions=itemView.findViewById(R.id.quiz_questions);
        imgTrue=itemView.findViewById(R.id.trueButton);
        imgFalse=itemView.findViewById(R.id.falseButton);


    }

    public TextView getTxtQuizQuestions() {
        return txtQuizQuestions;
    }



    public ImageButton getImgTrue() {
        return imgTrue;
    }



    public ImageButton getImgFalse() {
        return imgFalse;
    }


}
