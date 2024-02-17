package Composition;

public class compositionDriver
{
    public static void main(String[] args)
    {

        folder php_demo1 = new folder();
        folder source_files = new folder();
        folder include_path = new folder();
        folder phalcon = new folder();
        //folder app = new folder();
        folder config = new folder();
        folder controllers = new folder();
        folder library = new folder();
        folder migrations = new folder();
        folder models = new folder();
        folder views = new folder();
        folder cache = new folder();
        //folder publicc = new folder();
        folder remoteFiles = new folder();

        file htaccess = new file();
        file htrouter = new file();
        file index = new file();


        php_demo1.setFolderName("php_demo1");
        source_files.setFolderName("source_files");
        include_path.setFolderName("include_path");
        phalcon.setFolderName("phalcon");
        //app.setFolderName("app");
        config.setFolderName("config");
        controllers.setFolderName("controllers");
        library.setFolderName("library");
        migrations.setFolderName("migrations");
        models.setFolderName("models");
        views.setFolderName("views");
        cache.setFolderName("cache");
        //publicc.setFolderName("public");
        remoteFiles.setFolderName("Remote Files");

        htaccess.setFileName("htaccess");
        htrouter.setFileName("htrouter.php");
        index.setFileName("index.html");

        php_demo1.addSubFolder(source_files);
        php_demo1.addSubFolder(include_path);
        php_demo1.addSubFolder(remoteFiles);

        source_files.addSubFolder(phalcon);
        //source_files.addSubFolder(app);
        source_files.addSubFolder(cache);
        //source_files.addSubFolder(publicc);

        //app.addSubFolder(config);
        //app.addSubFolder(controllers);
        //app.addSubFolder(library);
        //app.addSubFolder(migrations);
        //app.addSubFolder(models);
        //app.addSubFolder(views);

        //publicc.addFile(htaccess);
        //publicc.addFile(htrouter);
        //publicc.addFile(index);

        php_demo1.printFolder("  ");
    }
}
