package bentihon.licount.com.myfiratapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.transition.ChangeBounds;
import android.transition.Scene;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

public class animateLayout extends AppCompatActivity {


    int mLayoutState = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animate_layout);

        final LinearLayout linearLayout1 = new LinearLayout(animateLayout.this);
        layout(linearLayout1);

        linearLayout1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (mLayoutState == 1) {
                    linearLayout1.removeAllViews();
                    layout2(linearLayout1);
                    mLayoutState = 2;
                }
                else if(mLayoutState == 2) {
                    linearLayout1.removeAllViews();
                    layout3(linearLayout1);
                    mLayoutState = 3;

                }
                     else {
                    linearLayout1.removeAllViews();
                    layout(linearLayout1);
                    mLayoutState = 1;
                }
            }

        });
    }

    public void layout(LinearLayout linearLayout1){
        TextView PinkTextView = new TextView(this);
        PinkTextView.setText("Pink");
        //to do position PinkTextView.setLayoutParams(ma);
        PinkTextView.setTextSize(22);
        PinkTextView.setBackgroundResource(R.color.Pink);
        // LinearLayout.LayoutParams p = (LinearLayout.LayoutParams)linearLayout1.getLayoutParams();
        //p.setMargins(10,10,20,30);
        linearLayout1.addView(PinkTextView );

        TextView BlueTextView = new TextView(this);
        BlueTextView.setText("Blue");
        BlueTextView.setTextSize(22);
        BlueTextView.setBackgroundResource(R.color.Blue);
        //     LinearLayout.LayoutParams b = (LinearLayout.LayoutParams)linearLayout.getLayoutParams();
        //     b.setMargins(50,50,40,70);
        linearLayout1.addView(BlueTextView);

        TextView BlackTextView = new TextView(this);
        BlackTextView.setText("Black");
        BlackTextView.setTextSize(22);
        BlackTextView.setBackgroundResource(R.color.Black);
        linearLayout1.addView(BlackTextView);

        TextView BrwonTextView = new TextView(this);
        BrwonTextView.setText("Brwon");
        BrwonTextView.setTextSize(22);
        BrwonTextView.setBackgroundResource(R.color.Brown);
        linearLayout1.addView(BrwonTextView);

        TextView RedTextView = new TextView(this);
        RedTextView.setText("Red");
        RedTextView.setTextSize(22);
        RedTextView.setBackgroundResource(R.color.Red);
        linearLayout1.addView(RedTextView);

        TextView YellowTextView = new TextView(this);
        YellowTextView.setText("Yellow");
        YellowTextView.setTextSize(22);
        YellowTextView.setBackgroundResource(R.color.Yellow);
        linearLayout1.addView(YellowTextView);

        TextView GreenTextView = new TextView(this);
        GreenTextView.setText("Green");
        GreenTextView.setTextSize(22);
        GreenTextView.setBackgroundResource(R.color.Green);
        linearLayout1.addView(GreenTextView);

        this.setContentView(linearLayout1, new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT));
    }

    public void layout2(LinearLayout la){



        TextView BlueTextView = new TextView(this);
        BlueTextView.setText("Blue");
        BlueTextView.setTextSize(22);
        BlueTextView.setBackgroundResource(R.color.Blue);
        //     LinearLayout.LayoutParams b = (LinearLayout.LayoutParams)linearLayout.getLayoutParams();
        //     b.setMargins(50,50,40,70);
        la.addView(BlueTextView);

        TextView PinkTextView = new TextView(this);
        PinkTextView.setText("Pink");
        PinkTextView.setTextSize(22);
        PinkTextView.setBackgroundResource(R.color.Pink);
        la.addView(PinkTextView );

        TextView BlackTextView = new TextView(this);
        BlackTextView.setText("Black");
        BlackTextView.setTextSize(22);
        BlackTextView.setBackgroundResource(R.color.Black);
        BlackTextView.setTextColor(34);
        la.addView(BlackTextView);

        TextView GreenTextView = new TextView(this);
        GreenTextView.setText("Green");
        GreenTextView.setTextSize(22);
        GreenTextView.setBackgroundResource(R.color.Green);
        GreenTextView.setGravity(Gravity.BOTTOM);
        la.addView(GreenTextView);

        TextView BrwonTextView = new TextView(this);
        BrwonTextView.setText("Brwon");
        BrwonTextView.setTextSize(22);
        BrwonTextView.setBackgroundResource(R.color.Brown);
        la.addView(BrwonTextView);

        TextView RedTextView = new TextView(this);
        RedTextView.setText("Red");
        RedTextView.setTextSize(22);
        RedTextView.setBackgroundResource(R.color.Red);
        la.addView(RedTextView);

        TextView YellowTextView = new TextView(this);
        YellowTextView.setText("Yellow");
        YellowTextView.setTextSize(22);
        YellowTextView.setBackgroundResource(R.color.Yellow);
        la.addView(YellowTextView);


        this.setContentView(la, new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT));

    }

    private void layout3(LinearLayout la) {

        TextView YellowTextView = new TextView(this);
        YellowTextView.setText("Yellow");
        YellowTextView.setTextSize(22);
        YellowTextView.setBackgroundResource(R.color.Yellow);
        la.addView(YellowTextView);

        TextView GreenTextView = new TextView(this);
        GreenTextView.setText("Green");
        GreenTextView.setTextSize(22);
        GreenTextView.setBackgroundResource(R.color.Green);
        GreenTextView.setGravity(Gravity.BOTTOM);
        la.addView(GreenTextView);

        TextView BlueTextView = new TextView(this);
        BlueTextView.setText("Blue");
        BlueTextView.setTextSize(22);
        BlueTextView.setBackgroundResource(R.color.Blue);
        //     LinearLayout.LayoutParams b = (LinearLayout.LayoutParams)linearLayout.getLayoutParams();
        //     b.setMargins(50,50,40,70);
        la.addView(BlueTextView);


        TextView RedTextView = new TextView(this);
        RedTextView.setText("Red");
        RedTextView.setTextSize(22);
        RedTextView.setBackgroundResource(R.color.Red);
        la.addView(RedTextView);

        TextView PinkTextView = new TextView(this);
        PinkTextView.setText("Pink");
        PinkTextView.setTextSize(22);
        PinkTextView.setBackgroundResource(R.color.Pink);
        la.addView(PinkTextView );

        TextView BlackTextView = new TextView(this);
        BlackTextView.setText("Black");
        BlackTextView.setTextSize(22);
        BlackTextView.setBackgroundResource(R.color.Black);
        la.addView(BlackTextView);

        TextView BrwonTextView = new TextView(this);
        BrwonTextView.setText("Brwon");
        BrwonTextView.setTextSize(22);
        BrwonTextView.setBackgroundResource(R.color.Brown);
        la.addView(BrwonTextView);

        this.setContentView(la, new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT));
    }
}
