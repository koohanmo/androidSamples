package com.koo.hanmo.androidsampletest;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class RecyclerActivity extends AppCompatActivity {

    RecyclerView mRecyclerView;
    RecycleAdapter mAdapter;
    ArrayList<DummyData> dataSet;
    Context mcon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);
        this.mcon= this;
        mRecyclerView = (RecyclerView)findViewById(R.id.recycle_main);
        makeDummy();
        mAdapter = new RecycleAdapter(dataSet);
        mRecyclerView.setAdapter(mAdapter);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private class ListRow extends RecyclerView.ViewHolder{

        TextView txtName, txtPhone;
        ImageView img;


        public ListRow(View itemView) {
            super(itemView);
            txtName = (TextView)itemView.findViewById(R.id.txt_name);
            txtPhone = (TextView)itemView.findViewById(R.id.txt_phone);
            img = (ImageView)itemView.findViewById(R.id.img_url);
        }

        public void setData(DummyData data){
            txtName.setText(data.getName());
            txtPhone.setText(data.getPhone());
            Glide.with(mcon).load(data.getImgURL()).into(img);
        }
    }

    private class RecycleAdapter extends RecyclerView.Adapter<ListRow>{
        private ArrayList<DummyData> mdataSet;

        public RecycleAdapter(ArrayList<DummyData> ds){
            this.mdataSet = ds;
        }

        @Override
        public ListRow onCreateViewHolder(ViewGroup parent, int viewType) {
            View v = getLayoutInflater().inflate(R.layout.item_recyclerview,parent,false);
            return new ListRow(v);
        }

        @Override
        public void onBindViewHolder(ListRow holder, int position) {
            DummyData curRow = mdataSet.get(position);
            holder.setData(curRow);
        }

        @Override
        public int getItemCount() {
            return mdataSet.size();
        }
    }

    private void makeDummy(){
        dataSet = new ArrayList<DummyData>();
        DummyData temp = new DummyData("홍길동","010-2255-5555","http://cfile6.uf.tistory.com/image/26753846577070FF201038");
        dataSet.add(temp);
        temp = new DummyData("홍길동","010-2255-5555","http://cfile6.uf.tistory.com/image/26753846577070FF201038");
        dataSet.add(temp);
        temp = new DummyData("홍길동","010-2255-5555","http://cfile6.uf.tistory.com/image/26753846577070FF201038");
        dataSet.add(temp);
        temp = new DummyData("홍길동","010-2255-5555","http://cfile6.uf.tistory.com/image/26753846577070FF201038");
        dataSet.add(temp);
        temp = new DummyData("홍길동","010-2255-5555","http://cfile6.uf.tistory.com/image/26753846577070FF201038");
        dataSet.add(temp);
        temp = new DummyData("홍길동","010-2255-5555","http://cfile6.uf.tistory.com/image/26753846577070FF201038");
        dataSet.add(temp);
        temp = new DummyData("홍길동","010-2255-5555","http://cfile6.uf.tistory.com/image/26753846577070FF201038");
        dataSet.add(temp);
        temp = new DummyData("홍길동","010-2255-5555","http://cfile6.uf.tistory.com/image/26753846577070FF201038");
        dataSet.add(temp);
        temp = new DummyData("홍길동","010-2255-5555","http://cfile6.uf.tistory.com/image/26753846577070FF201038");
        dataSet.add(temp);
        temp = new DummyData("홍길동","010-2255-5555","http://cfile6.uf.tistory.com/image/26753846577070FF201038");
        dataSet.add(temp);temp = new DummyData("홍길동","010-2255-5555","http://cfile6.uf.tistory.com/image/26753846577070FF201038");
        dataSet.add(temp);
        temp = new DummyData("홍길동","010-2255-5555","http://cfile6.uf.tistory.com/image/26753846577070FF201038");
        dataSet.add(temp);
        temp = new DummyData("홍길동","010-2255-5555","http://cfile6.uf.tistory.com/image/26753846577070FF201038");
        dataSet.add(temp);
        temp = new DummyData("홍길동","010-2255-5555","http://cfile6.uf.tistory.com/image/26753846577070FF201038");
        dataSet.add(temp);
        temp = new DummyData("홍길동","010-2255-5555","http://cfile6.uf.tistory.com/image/26753846577070FF201038");
        dataSet.add(temp);temp = new DummyData("홍길동","010-2255-5555","http://cfile6.uf.tistory.com/image/26753846577070FF201038");
        dataSet.add(temp);
        temp = new DummyData("홍길동","010-2255-5555","http://cfile6.uf.tistory.com/image/26753846577070FF201038");
        dataSet.add(temp);
        temp = new DummyData("홍길동","010-2255-5555","http://cfile6.uf.tistory.com/image/26753846577070FF201038");
        dataSet.add(temp);
        temp = new DummyData("홍길동","010-2255-5555","http://cfile6.uf.tistory.com/image/26753846577070FF201038");
        dataSet.add(temp);temp = new DummyData("홍길동","010-2255-5555","http://cfile6.uf.tistory.com/image/26753846577070FF201038");
        dataSet.add(temp);
        temp = new DummyData("홍길동","010-2255-5555","http://cfile6.uf.tistory.com/image/26753846577070FF201038");
        dataSet.add(temp);
    }
}
