package com.example.sqlitedb_miguel

import android.app.DownloadManager
import android.content.ContentValues
import android.content.Context
import android.database.Cursor
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class DBHelper (context:Context,factory:SQLiteDatabase.CursorFactory?):
        SQLiteOpenHelper(context,DATABASE_NAME,factory,DATABASE_VERSION){
    override fun onCreate(p0: SQLiteDatabase?) {
        val query=("CREATE TABLE"+ TABLE NAME + "("+
                ID_COL+"INTEGER PRIMARY KEY,"+
                NAME_COL+ "TEXT"+ AGE_COL+"TEXT"+ ")")
        db.execSQL(query)

    }

    override fun onUpgrade(db: SQLiteDatabase?, p1: Int, p2: Int) {
        dp.execSQL("DROP TABLE IF EXISTS"+TABLE_NAME)
        Oncreate(db)
    }
    fun addname(name:String,age:String){
        val values=ContentValues()
        values.put(NAME_COL,name)
        values.put(AGE_COL,age)

        val db=this.writableDatabase
        db.insert(TABLE_NAME,null,values)

        db.close()
    }
    fun getName(): Cursor? {
        val db = this.readableDatabase
        return db.rawQuery("SELECT *FROM" + TABLE_NAME, null)
    }
      companion object {
            private val DATABASE_NAME="emobilis"
            private val DATABASE_VERSION=1
            val TABLE_NAME="midmorning"
            val ID_COL="id"
            val NAME_COL="name"
            val AGE_COL="age"

        }
    }
    }

