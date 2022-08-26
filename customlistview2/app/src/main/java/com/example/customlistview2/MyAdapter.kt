package com.example.customlistview2

import android.content.Context

class MyAdapter(var mCtx:Context,var resourcse:Int,items:List<model>)(ArrayAdapter<model>(mCtx,resources,items) {
}
    overr