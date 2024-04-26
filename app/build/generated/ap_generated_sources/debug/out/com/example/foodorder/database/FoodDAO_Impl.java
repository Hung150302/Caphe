package com.example.foodorder.database;

import android.database.Cursor;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.example.foodorder.model.Food;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings({"unchecked", "deprecation"})
public final class FoodDAO_Impl implements FoodDAO {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Food> __insertionAdapterOfFood;

  private final EntityDeletionOrUpdateAdapter<Food> __deletionAdapterOfFood;

  private final EntityDeletionOrUpdateAdapter<Food> __updateAdapterOfFood;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAllFood;

  public FoodDAO_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfFood = new EntityInsertionAdapter<Food>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `food` (`id`,`name`,`image`,`banner`,`description`,`price`,`sale`,`count`,`totalPrice`,`popular`) VALUES (?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Food value) {
        stmt.bindLong(1, value.getId());
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        if (value.getImage() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getImage());
        }
        if (value.getBanner() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getBanner());
        }
        if (value.getDescription() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getDescription());
        }
        stmt.bindLong(6, value.getPrice());
        stmt.bindLong(7, value.getSale());
        stmt.bindLong(8, value.getCount());
        stmt.bindLong(9, value.getTotalPrice());
        final int _tmp;
        _tmp = value.isPopular() ? 1 : 0;
        stmt.bindLong(10, _tmp);
      }
    };
    this.__deletionAdapterOfFood = new EntityDeletionOrUpdateAdapter<Food>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `food` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Food value) {
        stmt.bindLong(1, value.getId());
      }
    };
    this.__updateAdapterOfFood = new EntityDeletionOrUpdateAdapter<Food>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `food` SET `id` = ?,`name` = ?,`image` = ?,`banner` = ?,`description` = ?,`price` = ?,`sale` = ?,`count` = ?,`totalPrice` = ?,`popular` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Food value) {
        stmt.bindLong(1, value.getId());
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        if (value.getImage() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getImage());
        }
        if (value.getBanner() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getBanner());
        }
        if (value.getDescription() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getDescription());
        }
        stmt.bindLong(6, value.getPrice());
        stmt.bindLong(7, value.getSale());
        stmt.bindLong(8, value.getCount());
        stmt.bindLong(9, value.getTotalPrice());
        final int _tmp;
        _tmp = value.isPopular() ? 1 : 0;
        stmt.bindLong(10, _tmp);
        stmt.bindLong(11, value.getId());
      }
    };
    this.__preparedStmtOfDeleteAllFood = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE from food";
        return _query;
      }
    };
  }

  @Override
  public void insertFood(final Food food) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfFood.insert(food);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteFood(final Food food) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfFood.handle(food);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void updateFood(final Food food) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __updateAdapterOfFood.handle(food);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteAllFood() {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAllFood.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteAllFood.release(_stmt);
    }
  }

  @Override
  public List<Food> getListFoodCart() {
    final String _sql = "SELECT * FROM food";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
      final int _cursorIndexOfImage = CursorUtil.getColumnIndexOrThrow(_cursor, "image");
      final int _cursorIndexOfBanner = CursorUtil.getColumnIndexOrThrow(_cursor, "banner");
      final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
      final int _cursorIndexOfPrice = CursorUtil.getColumnIndexOrThrow(_cursor, "price");
      final int _cursorIndexOfSale = CursorUtil.getColumnIndexOrThrow(_cursor, "sale");
      final int _cursorIndexOfCount = CursorUtil.getColumnIndexOrThrow(_cursor, "count");
      final int _cursorIndexOfTotalPrice = CursorUtil.getColumnIndexOrThrow(_cursor, "totalPrice");
      final int _cursorIndexOfPopular = CursorUtil.getColumnIndexOrThrow(_cursor, "popular");
      final List<Food> _result = new ArrayList<Food>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final Food _item;
        _item = new Food();
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        _item.setId(_tmpId);
        final String _tmpName;
        _tmpName = _cursor.getString(_cursorIndexOfName);
        _item.setName(_tmpName);
        final String _tmpImage;
        _tmpImage = _cursor.getString(_cursorIndexOfImage);
        _item.setImage(_tmpImage);
        final String _tmpBanner;
        _tmpBanner = _cursor.getString(_cursorIndexOfBanner);
        _item.setBanner(_tmpBanner);
        final String _tmpDescription;
        _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
        _item.setDescription(_tmpDescription);
        final int _tmpPrice;
        _tmpPrice = _cursor.getInt(_cursorIndexOfPrice);
        _item.setPrice(_tmpPrice);
        final int _tmpSale;
        _tmpSale = _cursor.getInt(_cursorIndexOfSale);
        _item.setSale(_tmpSale);
        final int _tmpCount;
        _tmpCount = _cursor.getInt(_cursorIndexOfCount);
        _item.setCount(_tmpCount);
        final int _tmpTotalPrice;
        _tmpTotalPrice = _cursor.getInt(_cursorIndexOfTotalPrice);
        _item.setTotalPrice(_tmpTotalPrice);
        final boolean _tmpPopular;
        final int _tmp;
        _tmp = _cursor.getInt(_cursorIndexOfPopular);
        _tmpPopular = _tmp != 0;
        _item.setPopular(_tmpPopular);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<Food> checkFoodInCart(final int id) {
    final String _sql = "SELECT * FROM food WHERE id=?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
      final int _cursorIndexOfImage = CursorUtil.getColumnIndexOrThrow(_cursor, "image");
      final int _cursorIndexOfBanner = CursorUtil.getColumnIndexOrThrow(_cursor, "banner");
      final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
      final int _cursorIndexOfPrice = CursorUtil.getColumnIndexOrThrow(_cursor, "price");
      final int _cursorIndexOfSale = CursorUtil.getColumnIndexOrThrow(_cursor, "sale");
      final int _cursorIndexOfCount = CursorUtil.getColumnIndexOrThrow(_cursor, "count");
      final int _cursorIndexOfTotalPrice = CursorUtil.getColumnIndexOrThrow(_cursor, "totalPrice");
      final int _cursorIndexOfPopular = CursorUtil.getColumnIndexOrThrow(_cursor, "popular");
      final List<Food> _result = new ArrayList<Food>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final Food _item;
        _item = new Food();
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        _item.setId(_tmpId);
        final String _tmpName;
        _tmpName = _cursor.getString(_cursorIndexOfName);
        _item.setName(_tmpName);
        final String _tmpImage;
        _tmpImage = _cursor.getString(_cursorIndexOfImage);
        _item.setImage(_tmpImage);
        final String _tmpBanner;
        _tmpBanner = _cursor.getString(_cursorIndexOfBanner);
        _item.setBanner(_tmpBanner);
        final String _tmpDescription;
        _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
        _item.setDescription(_tmpDescription);
        final int _tmpPrice;
        _tmpPrice = _cursor.getInt(_cursorIndexOfPrice);
        _item.setPrice(_tmpPrice);
        final int _tmpSale;
        _tmpSale = _cursor.getInt(_cursorIndexOfSale);
        _item.setSale(_tmpSale);
        final int _tmpCount;
        _tmpCount = _cursor.getInt(_cursorIndexOfCount);
        _item.setCount(_tmpCount);
        final int _tmpTotalPrice;
        _tmpTotalPrice = _cursor.getInt(_cursorIndexOfTotalPrice);
        _item.setTotalPrice(_tmpTotalPrice);
        final boolean _tmpPopular;
        final int _tmp;
        _tmp = _cursor.getInt(_cursorIndexOfPopular);
        _tmpPopular = _tmp != 0;
        _item.setPopular(_tmpPopular);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}
