package com.example.foodorder.database;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class FoodDatabase_Impl extends FoodDatabase {
  private volatile FoodDAO _foodDAO;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `food` (`id` INTEGER NOT NULL, `name` TEXT, `image` TEXT, `banner` TEXT, `description` TEXT, `price` INTEGER NOT NULL, `sale` INTEGER NOT NULL, `count` INTEGER NOT NULL, `totalPrice` INTEGER NOT NULL, `popular` INTEGER NOT NULL, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'cef083853cf2c443c66a2c16d0e45aa2')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `food`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsFood = new HashMap<String, TableInfo.Column>(10);
        _columnsFood.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFood.put("name", new TableInfo.Column("name", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFood.put("image", new TableInfo.Column("image", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFood.put("banner", new TableInfo.Column("banner", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFood.put("description", new TableInfo.Column("description", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFood.put("price", new TableInfo.Column("price", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFood.put("sale", new TableInfo.Column("sale", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFood.put("count", new TableInfo.Column("count", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFood.put("totalPrice", new TableInfo.Column("totalPrice", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFood.put("popular", new TableInfo.Column("popular", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysFood = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesFood = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoFood = new TableInfo("food", _columnsFood, _foreignKeysFood, _indicesFood);
        final TableInfo _existingFood = TableInfo.read(_db, "food");
        if (! _infoFood.equals(_existingFood)) {
          return new RoomOpenHelper.ValidationResult(false, "food(com.example.foodorder.model.Food).\n"
                  + " Expected:\n" + _infoFood + "\n"
                  + " Found:\n" + _existingFood);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "cef083853cf2c443c66a2c16d0e45aa2", "dc29026e34cffd25b6a29bf9a61b9092");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "food");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `food`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  public FoodDAO foodDAO() {
    if (_foodDAO != null) {
      return _foodDAO;
    } else {
      synchronized(this) {
        if(_foodDAO == null) {
          _foodDAO = new FoodDAO_Impl(this);
        }
        return _foodDAO;
      }
    }
  }
}
