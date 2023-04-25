package edu.sdsmt.hamsterrunwilsonadeline;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import java.util.Random;

public class GameBoardView extends View {

    ItemType[][] items;
    Game game;
    private Paint tubePainter;
    private Paint foodPainter;
    private Paint zoomPainter;
    private Paint personPainter;
    private Paint barPainter;
    private Paint homePainter;
    private final int gridSize = 5;
    private float circleRadius;
    private float circleSpacing;

    public GameBoardView(Context context) {
        super(context);
        init();
    }

    public GameBoardView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public GameBoardView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    public ItemType getRandomItemType() {
        Random random = new Random();
        ItemType[] itemTypes = ItemType.values();
        int index = random.nextInt(itemTypes.length);
        return itemTypes[index];
    }

    private void init() {
        items = new ItemType[5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                items[j][i] = getRandomItemType();
            }
        }

        // tube
        tubePainter = new Paint();
        tubePainter.setColor(Color.BLUE);
        tubePainter.setStyle(Paint.Style.FILL);

        // food
        foodPainter = new Paint();
        foodPainter.setColor(Color.YELLOW);
        foodPainter.setStyle(Paint.Style.FILL);

        // food
        barPainter = new Paint();
        barPainter.setColor(Color.BLACK);
        barPainter.setStyle(Paint.Style.FILL);

        // person
        personPainter = new Paint();
        personPainter.setColor(Color.CYAN);
        personPainter.setStyle(Paint.Style.FILL);

        // zoom
        zoomPainter = new Paint();
        zoomPainter.setColor(Color.GREEN);
        zoomPainter.setStyle(Paint.Style.FILL);

        // home
        homePainter = new Paint();
        homePainter.setColor(Color.parseColor("#FF4F79"));
        homePainter.setStyle(Paint.Style.FILL);
    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);

        float availableWidth = w - getPaddingLeft() - getPaddingRight();
        circleSpacing = availableWidth / (gridSize + 1);
        circleRadius = circleSpacing / 2;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        float x, y;
        for (int i = 0; i < gridSize; i++) {
            for (int j = 0; j < gridSize; j++) {
                x = getPaddingLeft() + circleSpacing * (i + 1);
                y = getPaddingTop() + circleSpacing * (j + 1);

                ItemType current = items[j][i];
                switch (current) {
                    case TUBE:
                        canvas.drawCircle(x, y, circleRadius, tubePainter);
                        break;
                    case HOME:
                        canvas.drawCircle(x, y, circleRadius, homePainter);
                        break;
                    case BARS:
                        canvas.drawCircle(x, y, circleRadius, barPainter);
                        break;
                    case ZOOM:
                        canvas.drawCircle(x, y, circleRadius, zoomPainter);
                        break;
                    case FOOD:
                        canvas.drawCircle(x, y, circleRadius, foodPainter);
                        break;
                    case PERSON:
                        canvas.drawCircle(x, y, circleRadius, personPainter);
                        break;
                }
            }
        }
    }
}
