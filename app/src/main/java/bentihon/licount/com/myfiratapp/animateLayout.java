package bentihon.licount.com.myfiratapp;

import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.support.annotation.IdRes;
import android.support.constraint.ConstraintSet;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.transition.ChangeBounds;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.view.View;
import android.view.animation.BounceInterpolator;
import android.widget.TextView;
import static android.view.ViewGroup.LayoutParams.WRAP_CONTENT;


public class animateLayout extends AppCompatActivity {

    ConstraintLayout myLayout;
    private int mLayoutState = 0;


    private static int TOP = 3;
    private static int BOTTOM = 4;
    private static int START = 6;
    private static int END = 7;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animate_layout);

        myLayout = findViewById(R.id.animatedLayout);

        final Transition mTransition = new ChangeBounds();
        mTransition.setDuration(1000); // todo: make the duration a function of the distance

        mTransition.setInterpolator(new BounceInterpolator());

        final ConstraintSet set1 = new ConstraintSet();
        final ConstraintSet set2 = new ConstraintSet();
        final ConstraintSet set3 = new ConstraintSet();


        myLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if (mLayoutState == 0) {
                    set1.applyTo(myLayout);
                    mLayoutState = 1;
                }
                else if(mLayoutState == 1) {
                    set2.applyTo(myLayout);
                    mLayoutState = 2;
                }
                     else {
                    set3.applyTo(myLayout);
                    mLayoutState = 0;
                }
                TransitionManager.beginDelayedTransition(myLayout, mTransition);

            }

        });

        TextView green = createTextView();
        green = init(green.getId(), "GREEN", R.color.Green);
        set1.constrainHeight(green.getId(), WRAP_CONTENT);
        set1.constrainWidth(green.getId(), WRAP_CONTENT);
        set1.centerVertically(green.getId(), R.id.animatedLayout);
        set1.centerHorizontally(green.getId(), R.id.animatedLayout);
        createConstraintSet(green.getId(), R.id.animatedLayout, set3, END, END, TOP, TOP);
        set3.connect(green.getId(), BOTTOM, R.id.animatedLayout, BOTTOM);
        set3.setMargin(green.getId(), 7, 30);


        TextView yellow = createTextView();
        yellow = init(yellow.getId(), "YELLOW", R.color.Yellow);
        createConstraintSet(yellow.getId(), green.getId(), set1, START, START, BOTTOM, TOP);
        createConstraintSet(yellow.getId(), green.getId(), set2, START, START, BOTTOM, BOTTOM);
        createConstraintSet(yellow.getId(), green.getId(), set3, END, START, BOTTOM, TOP);

        TextView orange = createTextView();
        orange = init(orange.getId(), "ORANGE", R.color.Orenge);
        createConstraintSet(orange.getId(), yellow.getId(), set1, START, START, BOTTOM, TOP);
        createConstraintSet(orange.getId(), yellow.getId(), set2, START, START, BOTTOM, BOTTOM);
        createConstraintSet(orange.getId(), yellow.getId(), set3, END, START, BOTTOM, TOP);

        TextView red = createTextView();
        red = init(red.getId(), "RED", R.color.Red);
        createConstraintSet(red.getId(), orange.getId(), set1, START, START, BOTTOM, TOP);
        createConstraintSet(red.getId(), orange.getId(), set2, START, START, BOTTOM, BOTTOM);
        createConstraintSet(red.getId(), orange.getId(), set3, END, START, BOTTOM, TOP);


        TextView blue = createTextView();
        blue = init(blue.getId(), "BLUE", R.color.Blue);
        createConstraintSet(blue.getId(), green.getId(), set1, START, START, TOP, BOTTOM);
        createConstraintSet(blue.getId(), green.getId(), set2, START, START, BOTTOM, BOTTOM);
        createConstraintSet(blue.getId(), green.getId(), set3, END, START, TOP, BOTTOM);


        TextView pink = createTextView();
        pink  = init(pink .getId(), "PINK", R.color.Pink);
        createConstraintSet(pink .getId(), blue.getId(), set1, START, START, TOP, BOTTOM);
        createConstraintSet(pink .getId(), blue.getId(), set2, START, START, BOTTOM, BOTTOM);
        createConstraintSet(pink .getId(), blue.getId(), set3, END, START, TOP, BOTTOM);

        TextView brawon = createTextView();
        brawon = init(brawon.getId(), "BRAWON", R.color.Brown);
        createConstraintSet(brawon.getId(), pink.getId(), set1, START, START, TOP, BOTTOM);
        createConstraintSet(brawon.getId(), pink.getId(), set2, START, START, BOTTOM, BOTTOM);
        createConstraintSet(brawon.getId(), pink.getId(), set3, END, START, TOP, BOTTOM);

        set1.applyTo(myLayout);
        set2.applyTo(myLayout);
        set3.applyTo(myLayout);
    }
    private TextView init(@IdRes int viewId, String s, int color) {
        TextView tv = new TextView(this);
        tv.setId(viewId);
        tv.setText(s);
        tv.setTextSize(20);
        tv.setBackgroundResource(color);
        myLayout.addView(tv);
        return tv;
    }

    private TextView createTextView() {
        TextView tv = new TextView(this);
        tv.setId(View.generateViewId());
        return tv;
    }

    private ConstraintSet createConstraintSet(@IdRes int viewId, @IdRes int parentId, ConstraintSet set, int start, int end, int start2, int end2) {
        set.constrainHeight(viewId, WRAP_CONTENT);
        set.constrainWidth(viewId, WRAP_CONTENT);
        set.connect(viewId, start, parentId, end);
        set.connect(viewId, start2, parentId, end2);
        return set;
    }

    public void layout(RelativeLayout RelativeLayout1) {
        TextView PinkTextView = new TextView(this);
        PinkTextView.setText("Pink");
        PinkTextView.setTextSize(22);
        PinkTextView.setBackgroundResource(R.color.Pink);
        PinkTextView.setY(350);
        PinkTextView.setX(225);
        RelativeLayout1.addView(PinkTextView);
    }
}
