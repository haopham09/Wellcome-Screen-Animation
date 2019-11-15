package com.thohao.animation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.media.MediaPlayer;
import android.media.audiofx.BassBoost;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.provider.Settings;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView imgAlpha, imgScale1,imgScale2,imgTranslate;
    boolean visible=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //imgAlpha=findViewById(R.id.imgViewAlpha);
        imgScale1=findViewById(R.id.imgView02);
        imgScale2=findViewById(R.id.imgView03);
        imgTranslate=findViewById(R.id.imgTranslate);
        imgScale1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StartScreen();
            }
        });
        //this goi trong block scope
        //type casting: dung cho moi quan he cha-con (giong ép kiểu)
        //final AlphaAnimation alphaAnimation= (AlphaAnimation) AnimationUtils.loadAnimation(this, R.anim.anim_alpha);
        /*imgAlpha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(alphaAnimation);
            }
        });*/
//scale 1
        //pivot vị trí trong image sẽ scale ra X=Y= 0% :góc trên cùng bên trái
        //pivotX <50% ; scale qua phải và nguoc lai
        //pivotY <50% ; scale xuong duoi và nguoc lai

//just hide
        /*imgScale2.setVisibility(View.GONE);
        imgTranslate.setVisibility(View.GONE);*/

        /*final Animation animationScale=AnimationUtils.loadAnimation(this, R.anim.anim_scale);
        final Animation animationAlphaGrab=AnimationUtils.loadAnimation(this, R.anim.anim_alphagrab);
        final Animation animationTranslate=AnimationUtils.loadAnimation(this, R.anim.anim_translate);

        animationScale.getDuration();*/
//hide
//        imgScale1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//just hade
                /*imgScale1.startAnimation(animationScale);
                Handler handler=new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        imgScale2.setVisibility(View.VISIBLE);
                        imgScale2.startAnimation(animationAlphaGrab);

                        //imgTranslate.setVisibility(visible? View.VISIBLE: View.GONE);
                        imgTranslate.setVisibility(View.VISIBLE);
                        imgTranslate.startAnimation(animationTranslate);
                        //visible=!visible;
                    }

                },animationScale.getDuration());*/


                /*CountDownTimer countDownTimer=new CountDownTimer() {
                    @Override
                    public void onTick(long millisUntilFinished) {
                    }
                    @Override
                    public void onFinish() {
                    }
                }*/
//            }
//        });

        //autoboxing (ép kiểu)

        //background music
        /*MediaPlayer player=MediaPlayer.create(this,
                Settings.System.DEFAULT_RINGTONE_URI);
        player.setLooping(false);
        player.start();*/

        //translate
        //Context context;
   /*     final Animation animationTranslate=AnimationUtils.loadAnimation(this, R.anim.anim_translate);
        imgTranslate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(animationTranslate);

            }
        });*/
   //run method StartScreen

    }
    private void StartScreen(){
        imgScale2.setVisibility(View.GONE);
        //imgTranslate.setVisibility(View.GONE);
        final Animation animationScale=AnimationUtils.loadAnimation(this, R.anim.anim_scale);
        final Animation animationAlphaGrab=AnimationUtils.loadAnimation(this, R.anim.anim_alphagrab);
        final Animation animationTranslate=AnimationUtils.loadAnimation(this, R.anim.anim_translate);

        animationScale.getDuration();
        imgScale1.startAnimation(animationScale);
        Handler handler=new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                imgScale2.setVisibility(View.VISIBLE);
                imgScale2.startAnimation(animationAlphaGrab);

                //imgTranslate.setVisibility(visible? View.VISIBLE: View.GONE);
                imgTranslate.setVisibility(View.VISIBLE);
                imgTranslate.startAnimation(animationTranslate);
                //visible=!visible;
            }
        },animationScale.getDuration());

        // hide imgTranslate
        animationTranslate.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
            }

            @Override
            public void onAnimationEnd(Animation animation) {
                imgTranslate.setVisibility(View.GONE);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {
            }
        });
    }
}
