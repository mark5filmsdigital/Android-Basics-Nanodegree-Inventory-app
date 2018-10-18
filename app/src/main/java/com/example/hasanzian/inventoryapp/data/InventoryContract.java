package com.example.hasanzian.inventoryapp.data;

import android.provider.BaseColumns;

/**
 * InventoryContract class contain all constant.
 */
public class InventoryContract {



    /**
     * constructor for InventoryContract class
     */
    private InventoryContract() {
    }

    /**
     * InventoryEntry contains constant for creating tables,columns.
     */
    public static final class InventoryEntry implements BaseColumns {

        public static final String TABLE_NAME = "Products";
        public static final String _ID = BaseColumns._ID;
        public static final String COLUMN_PRODUCT_NAME = "Product_Name";
        public static final String COLUMN_PRICE = "Price";
        public static final String COLUMN_QUANTITY = "Quantity";
        public static final String COLUMN_SUPPLIER_NAME = "Supplier_Name";
        public static final String COLUMN_SUPPLIER_PHONE_NUMBER = "Supplier_Phone_Number";


    }
}
