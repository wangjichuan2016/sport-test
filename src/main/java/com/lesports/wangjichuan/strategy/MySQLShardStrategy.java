package com.lesports.wangjichuan.strategy;

import com.google.code.shardbatis.strategy.ShardStrategy;

/**
 * Created by wangjichuan on 16-7-7.
 */
public class MySQLShardStrategy implements ShardStrategy {
    @Override
    public String getTargetTableName(String s, Object o, String s2) {
        if(o != null){
            System.out.println(o);
        }
        return "CMS_CATEGORY";
    }
}
