package tck.cn.myteam.util;

/**
 * Description :
 * <p>
 * Created by tck on 2016/11/6.
 */

public class DataManager {

    private static DataManager manager ;
    private static final int DATA_SOURCE_MEMORY = 1;
    private static final int DATA_SOURCE_DISK = 2;
    private static final int DATA_SOURCE_NETWORK = 3;

        private  DataManager() {

        }

        public static DataManager getInstance() {
            if (manager==null){
                manager = new DataManager();
            }
            return manager;
        }


}
