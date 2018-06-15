package test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.ServiceLoader;

import com.cheny.spi.service.DogService;

public class test {

	/*public static void main(String[] args) {
		ServiceLoader<DogService> coll=ServiceLoader.load(DogService.class);
		for (DogService dogService : coll) {
			dogService.sleep();
		}

	}*/
	
	public static void main(String[] args) {
        List<DogService> implList = load(DogService.class);
        if (implList != null && implList.size() >0) {
            for (DogService DogService: implList) {
            	DogService.sleep();;
            }
        }
    }
	private static final String PREFIX = "/META-INF/services/";

    @SuppressWarnings("unchecked")
	public static <T> List<T> load(Class<T> cls) {
        List<String> implClasses = readServiceFile(cls);
        List<T> implList = new ArrayList<T>();
        for (String implClass : implClasses) {
            Class<T> c = null;
            try {
                c = (Class<T>) Class.forName(implClass);
                implList.add(c.newInstance());
            } catch (Exception e) {
                return new ArrayList<T>();
            }
        }
        return implList;
    }

    private static List<String> readServiceFile(Class<?> cls) {
       String infName = PREFIX+cls.getCanonicalName();
        String fileName = cls.getResource(infName).getPath();
        //String fileName = cls.getResource("").getPath();
        try {
            //BufferedReader br = new BufferedReader(new FileReader(new File("E:\\ZGSH\\space2\\JavaSPI\\META-INF\\services\\com.cheny.spi.service.DogService")));
            BufferedReader br = new BufferedReader(new FileReader(new File(fileName)));
            String line = "";
            List<String> implClasses = new ArrayList<String>();
            while ((line = br.readLine()) != null) {
                implClasses.add(line);
            }
            return implClasses;
        } catch (FileNotFoundException fnfe) {
            System.out.println("File not found: " );
            return new ArrayList<String>();
        } catch (IOException ioe) {
            System.out.println("Read file failed: " );
            return new ArrayList<String>();
        }
    }

}
