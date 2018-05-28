package bentihon.licount.com.myfiratapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class animateLayout extends AppCompatActivity {


    int mLayoutState = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animate_layout);

        final RelativeLayout relativeLayout1 = new RelativeLayout(animateLayout.this);
        layout(relativeLayout1);

        relativeLayout1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (mLayoutState == 1) {
                    relativeLayout1.removeAllViews();
                    layout2(relativeLayout1);
                    mLayoutState = 2;
                }
                else if(mLayoutState == 2) {
                    relativeLayout1.removeAllViews();
                    layout3(relativeLayout1);
                    mLayoutState = 3;

                }
                     else {
                    relativeLayout1.removeAllViews();
                    layout(relativeLayout1);
                    mLayoutState = 1;
                }
            }

        });
    }

    public void layout(RelativeLayout RelativeLayout1){
        TextView PinkTextView = new TextView(this);
        PinkTextView.setText("Pink");
        PinkTextView.setTextSize(22);
        PinkTextView.setBackgroundResource(R.color.Pink);
        PinkTextView.setY(350);
        PinkTextView.setX(225);
        RelativeLayout1.addView(PinkTextView );

        TextView BlueTextView = new TextView(this);
        BlueTextView.setText("Blue");
        BlueTextView.setTextSize(22);
        BlueTextView.setBackgroundResource(R.color.Blue);
        BlueTextView.setY(350);
        BlueTextView.setX(225);
        RelativeLayout1.addView(BlueTextView);

        TextView OrengeTextView = new TextView(this);
        OrengeTextView.setText("Orenge");
        OrengeTextView.setTextSize(22);
        OrengeTextView.setBackgroundResource(R.color.Orenge);
        OrengeTextView.setY(350);
        OrengeTextView.setX(225);
        RelativeLayout1.addView(OrengeTextView);

        TextView BrwonTextView = new TextView(this);
        BrwonTextView.setText("Brwon");
        BrwonTextView.setTextSize(22);
        BrwonTextView.setBackgroundResource(R.color.Brown);
        BrwonTextView.setY(350);
        BrwonTextView.setX(225);
        RelativeLayout1.addView(BrwonTextView);

        TextView YellowTextView = new TextView(this);
        YellowTextView.setText("Yellow");
        YellowTextView.setTextSize(22);
        YellowTextView.setBackgroundResource(R.color.Yellow);
        YellowTextView.setY(350);
        YellowTextView.setX(225);
        RelativeLayout1.addView(YellowTextView);

        TextView GreenTextView = new TextView(this);
        GreenTextView.setText("Green");
        GreenTextView.setTextSize(22);
        GreenTextView.setBackgroundResource(R.color.Green);
        GreenTextView.setY(350);
        GreenTextView.setX(225);
        RelativeLayout1.addView(GreenTextView);

        TextView RedTextView = new TextView(this);
        RedTextView.setText("Red");
        RedTextView.setTextSize(22);
        RedTextView.setBackgroundResource(R.color.Red);
        RedTextView.setY(350);
        RedTextView.setX(225);
        RelativeLayout1.addView(RedTextView);

        this.setContentView(RelativeLayout1, new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams.MATCH_PARENT));
    }

    public void layout2(RelativeLayout la){



        TextView PinkTextView = new TextView(this);
        PinkTextView.setText("Pink");
        PinkTextView.setTextSize(22);
        PinkTextView.setBackgroundResource(R.color.Pink);
        PinkTextView.setY(260);
        PinkTextView.setX(225);
        la.addView(PinkTextView );

        TextView BlueTextView = new TextView(this);
        BlueTextView.setText("Blue");
        BlueTextView.setTextSize(22);
        BlueTextView.setBackgroundResource(R.color.Blue);
        BlueTextView.setY(290);
        BlueTextView.setX(225);
        la.addView(BlueTextView);

        TextView OrengeTextView = new TextView(this);
        OrengeTextView.setText("Orenge");
        OrengeTextView.setTextSize(22);
        OrengeTextView.setBackgroundResource(R.color.Orenge);
        OrengeTextView.setY(320);
        OrengeTextView.setX(225);
        la.addView(OrengeTextView);

        TextView BrwonTextView = new TextView(this);
        BrwonTextView.setText("Brwon");
        BrwonTextView.setTextSize(22);
        BrwonTextView.setBackgroundResource(R.color.Brown);
        BrwonTextView.setY(350);
        BrwonTextView.setX(225);
        la.addView(BrwonTextView);


        TextView YellowTextView = new TextView(this);
        YellowTextView.setText("Yellow");
        YellowTextView.setTextSize(22);
        YellowTextView.setBackgroundResource(R.color.Yellow);
        YellowTextView.setY(380);
        YellowTextView.setX(225);
        la.addView(YellowTextView);

        TextView GreenTextView = new TextView(this);
        GreenTextView.setText("Green");
        GreenTextView.setTextSize(22);
        GreenTextView.setBackgroundResource(R.color.Green);
        GreenTextView.setY(410);
        GreenTextView.setX(225);
        int greenwhidth = GreenTextView.getWidth();
        la.addView(GreenTextView);

        TextView RedTextView = new TextView(this);
        RedTextView.setText("Red");
        RedTextView.setTextSize(22);
        RedTextView.setBackgroundResource(R.color.Red);
        RedTextView.setY(440);
        RedTextView.setX(225);
        la.addView(RedTextView);

        this.setContentView(la, new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams.MATCH_PARENT));

    }

    private void layout3(RelativeLayout la) {

        TextView PinkTextView = new TextView(this);
        PinkTextView.setText("Pink");
        PinkTextView.setTextSize(22);
        PinkTextView.setBackgroundResource(R.color.Pink);
        PinkTextView.setY(260);
        PinkTextView.setX(215);
        la.addView(PinkTextView );

        TextView BlueTextView = new TextView(this);
        BlueTextView.setText("Blue");
        BlueTextView.setTextSize(22);
        BlueTextView.setBackgroundResource(R.color.Blue);
        BlueTextView.setY(290);
        BlueTextView.setX(260);
        la.addView(BlueTextView);

        TextView OrengeTextView = new TextView(this);
        OrengeTextView.setText("Orenge");
        OrengeTextView.setTextSize(22);
        OrengeTextView.setBackgroundResource(R.color.Orenge);
        OrengeTextView.setY(320);
        OrengeTextView.setX(300);
        la.addView(OrengeTextView);

        TextView BrwonTextView = new TextView(this);
        BrwonTextView.setText("Brwon");
        BrwonTextView.setTextSize(22);
        BrwonTextView.setBackgroundResource(R.color.Brown);
        BrwonTextView.setY(350);
        BrwonTextView.setX(370);
        la.addView(BrwonTextView);

        TextView YellowTextView = new TextView(this);
        YellowTextView.setText("Yellow");
        YellowTextView.setTextSize(22);
        YellowTextView.setBackgroundResource(R.color.Yellow);
        YellowTextView.setY(380);
        YellowTextView.setX(305);
        la.addView(YellowTextView);

        TextView GreenTextView = new TextView(this);
        GreenTextView.setText("Green");
        GreenTextView.setTextSize(22);
        GreenTextView.setBackgroundResource(R.color.Green);
        GreenTextView.setY(410);
        GreenTextView.setX(245);
        la.addView(GreenTextView);

        TextView RedTextView = new TextView(this);
        RedTextView.setText("Red");
        RedTextView.setTextSize(22);
        RedTextView.setBackgroundResource(R.color.Red);
        RedTextView.setY(440);
        RedTextView.setX(205);
        la.addView(RedTextView);

        this.setContentView(la, new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams.MATCH_PARENT));
    }
}
