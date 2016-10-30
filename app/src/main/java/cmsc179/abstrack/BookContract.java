package cmsc179.abstrack;

import android.provider.BaseColumns;




/**
 * API Contract for the Pets app.
 */
public final class BookContract {

    // To prevent someone from accidentally instantiating the contract class,
    // give it an empty constructor.
    private BookContract() {}

    /**
     * Inner class that defines constant values for the pets database table.
     * Each entry in the table represents a single pet.
     */
    public static final class BookEntry implements BaseColumns {

        /** Name of database table for pets */
        public final static String TABLE_NAME = "Book";

        /**
         * Unique ID number for the pet (only for use in the database table).
         *
         * Type: INTEGER
         */
        public final static String _ID = BaseColumns._ID;

        /**
         * Name of the pet.
         *
         * Type: TEXT
         */
        public final static String COLUMN_BOOK_NAME ="Bookname";

        /**
         * Breed of the pet.
         *
         * Type: TEXT
         */
        public final static String COLUMN_BOOK_DIA = "dialogue";

        public final static String COLUMN_BOOK_CONTENT = "content";

        /**
         * Gender of the pet.
         *
         * The only possible values are {@link #GENDER_UNKNOWN}, {@link #GENDER_MALE},
         * or {@link #GENDER_FEMALE}.
         *
         * Type: INTEGER
         */

    }

}

