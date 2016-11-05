package com.example.hp.smallrobot.util;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import android.util.Log;
import android.widget.Toast;

import com.example.hp.smallrobot.MainActivity;
import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hp on 2016/11/4 0004.
 * 帮助类
 */

public class HelpUtil {

    /**
     * 解析json数据
     *
     * @param json
     * @param class1
     * @return 返回JSON数据对象bean
     */
    public static <T> Object processJson(String json, Class<T> class1) {
        // 解析json
        Gson gson = new Gson();
        T bean = gson.fromJson(json, class1);

        return bean;
    }

    public static boolean launchApp(Context context, String AppName) {

        PackageManager packageManager = context.getPackageManager();
        List<PackageInfo> packages = getAllApps(context);
        PackageInfo pa = null;
        String pakageNmae = null;
        for (int i = 0; i < packages.size(); i++) {
            pa = packages.get(i);
            //获得应用名
            String appLabel = packageManager.getApplicationLabel(pa.applicationInfo).toString();
            //获得包名
            String appPackage = pa.packageName;
            Log.e("" + i, appLabel + "   " + appPackage);
            if (AppName.contains(appLabel)) {
                MainActivity.left_tv = appLabel;
                pakageNmae = appPackage;
                continue;
            }
        }
        if (!TextUtils.isEmpty(pakageNmae)) {
            Intent intent = packageManager.getLaunchIntentForPackage(pakageNmae);//packageName就是我们获得要启动应用的包名
            context.startActivity(intent);
            return true;
        } else {
//            Toast.makeText(context, "没找到对应的包名", Toast.LENGTH_SHORT).show();
            return false;
        }
    }

    /**
     * 获得手机内应用的包名，返回一个List集合
     **/
    private static List<PackageInfo> getAllApps(Context context) {
        List<PackageInfo> apps = new ArrayList();
        PackageManager packageManager = context.getPackageManager();
        //获取手机内所有应用
        List<PackageInfo> paklist = packageManager.getInstalledPackages(0);
        for (int i = 0; i < paklist.size(); i++) {
            PackageInfo pak = paklist.get(i);
            //判断是否为非系统预装的应用  (大于0为系统预装应用，小于等于0为非系统应用)
//            if ((pak.applicationInfo.flags & pak.applicationInfo.FLAG_SYSTEM) <= 0) {
            apps.add(pak);
//            }
        }
        return apps;
    }
}
