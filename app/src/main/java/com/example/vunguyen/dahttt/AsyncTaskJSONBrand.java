package com.example.vunguyen.dahttt;

import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

/**
 * Created by vunguyen on 5/31/2015.
 */
public class AsyncTaskJSONBrand  extends AsyncTaskJSON{
    public ArrayList<CategoryAdapter.Categoty> brandArrayList = null;
    public AsyncTaskJSONBrand(ArrayList<CategoryAdapter.Categoty> brandArrayList){
       super(brandArrayList);
       this.brandArrayList = brandArrayList;
    }
    @Override
    protected  void onPostExecute(JSONObject jsonObject){
        try {
            JSONArray data = jsonObject.getJSONArray("data");

            JSONObject  data0 = data.getJSONObject(0);

            JSONArray brand =  data0.getJSONArray("brand");

            for (int i = 0; i < brand.length() ; i ++){
               brandArrayList.add(new CategoryAdapter.Categoty(brand.get(i).toString(), "brand_apple"));
                Log.i("debug json", brand.get(i).toString());
            }




        } catch (JSONException e) {
            e.printStackTrace();
        }
        // soundCloud = gson.fromJson(json, SoundCloud.class);

        // txtView = (TextView)mView.findViewById(R.id.txtView);
        // txtView.setText(soundCloud.title);

        //soundCloud.stream_url =  soundCloud.stream_url + "?client_id=b45b1aa10f1ac2941910a7f0d10f8e28&app_version=4a3bcba";

    }
}
