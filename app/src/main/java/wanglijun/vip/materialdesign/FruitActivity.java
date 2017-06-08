package wanglijun.vip.materialdesign;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import static android.os.Build.ID;

/**
 * 图片详情页面
 */
public class FruitActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private String name;
    private int id;
    private CollapsingToolbarLayout toolbarLayout;
    private ImageView imageView;
    private TextView textView;
    private ActionBar actionBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fruit);
        Intent intent = getIntent();
        name = intent.getStringExtra("name");
        id = intent.getIntExtra(ID,0);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbarLayout = (CollapsingToolbarLayout) findViewById(R.id.collapsing_bar);
        imageView = (ImageView) findViewById(R.id.fruit_image_view);
        textView = (TextView) findViewById(R.id.fruit_content_text);
        setSupportActionBar(toolbar);
        //得到actionbar的实例
        actionBar = getSupportActionBar();
        if (actionBar != null) {
            //让导航栏显示出来
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        //给图片设置标题
        toolbarLayout.setTitle(name);
        //设置顶部图片
        Glide.with(this).load(id).into(imageView);
        //设置下面的图片文字详情
        String fruitName = getFruitName(name);
        textView.setText(fruitName);
    }

    /**
     * 设置actionbar的返回事件
     * @param item
     * @return
     */
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    /**
     * 循环出500倍的文章详情
     *
     * @param name 图片说明
     * @return
     */
    private String getFruitName(String name) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 500; i++) {
            stringBuilder.append(name);

        }
        return stringBuilder.toString();
    }
}
