package com.example.quiztruefalseapp.controller;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.quiztruefalseapp.R;
import com.example.quiztruefalseapp.model.QuizQuestion;
import com.example.quiztruefalseapp.view.QuizViewHolder;

import java.util.List;

public class CardStackAdapter extends RecyclerView.Adapter<QuizViewHolder> {
    private Context mContext;
    private List<QuizQuestion> mQuizNames;
    private LayoutInflater mLayoutInflater;

    public CardStackAdapter(Context context, List<QuizQuestion> quizNames){
        mContext=context;
        mQuizNames=quizNames;
        mLayoutInflater=LayoutInflater.from(context);
    }
    @NonNull
    @Override
    public QuizViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view=mLayoutInflater.inflate(R.layout.quiz_view, parent, false);
        return new QuizViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull QuizViewHolder holder, int position) {
        holder.getTxtQuizQuestions().setText(mQuizNames.get(position).getQuestionText());
        holder.getImgTrue().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


              if (mQuizNames.get(position).isTrueAnswer()) {
                    Toast.makeText(mContext, "Correct Answer", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(mContext, "Wrong Answer", Toast.LENGTH_LONG).show();
                }
            }
        });
        holder.getImgFalse().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(mContext, "False is taped", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return mQuizNames.size();
    }
}
