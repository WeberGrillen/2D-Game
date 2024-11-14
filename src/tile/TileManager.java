package tile;

import main.GamePanel;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class TileManager {

    GamePanel gp;
    public Tile[] tile;
    public int mapTileNum[] [];

    // Constructor
    public TileManager(GamePanel gp) {

        this.gp = gp;

        tile = new Tile[35]; // Tile Array
        mapTileNum = new int[gp.maxWorldCol] [gp.maxWorldRow];

        getTileImage();
        loadMap("maps/world01.txt"); // FilePath here so it can easily be changed
    }

    public void getTileImage() {

        try {
            // Instantiate Tile Array


            tile[0] = new Tile();
            tile[0].image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("tiles/grass01.png"));

            tile[1] = new Tile();
            tile[1].image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("tiles/wall.png"));
            tile[1].collision = true;

            tile[2] = new Tile();
            tile[2].image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("tiles/water01.png"));
            tile[2].collision = true;

            tile[3] = new Tile();
            tile[3].image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("tiles/earth.png"));

            tile[4] = new Tile();
            tile[4].image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("tiles/tree.png"));
            tile[4].collision = true;

            tile[5] = new Tile();
            tile[5].image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("tiles/sand.png"));


//            // Dirt
//            tile[0] = new Tile();
//            tile[0].image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("tiles/earth.png"));
//
//            // Floor
//            tile[1] = new Tile();
//            tile[1].image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("tiles/floor01.png"));
//
//            // Grass
//            tile[2] = new Tile();
//            tile[2].image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("tiles/grass00.png"));
//
//            tile[3] = new Tile();
//            tile[3].image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("tiles/grass01.png"));
//
//            // Hut
//            tile[4] = new Tile();
//            tile[4].image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("tiles/hut.png"));
//
//            // Roads
//            tile[5] = new Tile();
//            tile[5].image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("tiles/road00.png"));
//
//            tile[6] = new Tile();
//            tile[6].image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("tiles/road01.png"));
//
//            tile[7] = new Tile();
//            tile[7].image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("tiles/road02.png"));
//
//            tile[8] = new Tile();
//            tile[8].image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("tiles/road03.png"));
//
//            tile[9] = new Tile();
//            tile[9].image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("tiles/road04.png"));
//
//            tile[10] = new Tile();
//            tile[10].image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("tiles/road05.png"));
//
//            tile[11] = new Tile();
//            tile[11].image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("tiles/road06.png"));
//
//            tile[12] = new Tile();
//            tile[12].image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("tiles/road07.png"));
//
//            tile[13] = new Tile();
//            tile[13].image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("tiles/road08.png"));
//
//            tile[14] = new Tile();
//            tile[14].image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("tiles/road09.png"));
//
//            tile[15] = new Tile();
//            tile[15].image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("tiles/road10.png"));
//
//            tile[16] = new Tile();
//            tile[16].image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("tiles/road11.png"));
//
//            tile[17] = new Tile();
//            tile[17].image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("tiles/road12.png"));
//
//            // Table
//            tile[18] = new Tile();
//            tile[18].image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("tiles/table01.png"));
//
//            // Tree
//            tile[19] = new Tile();
//            tile[19].image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("tiles/tree.png"));
//
//            // Wall
//            tile[20] = new Tile();
//            tile[20].image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("tiles/wall.png"));
//
//            // Water
//            tile[21] = new Tile();
//            tile[21].image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("tiles/water00.png"));
//
//            tile[22] = new Tile();
//            tile[22].image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("tiles/water01.png"));
//
//            tile[23] = new Tile();
//            tile[23].image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("tiles/water02.png"));
//
//            tile[24] = new Tile();
//            tile[24].image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("tiles/water03.png"));
//
//            tile[25] = new Tile();
//            tile[25].image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("tiles/water04.png"));
//
//            tile[26] = new Tile();
//            tile[26].image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("tiles/water05.png"));
//
//            tile[27] = new Tile();
//            tile[27].image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("tiles/water06.png"));
//
//            tile[28] = new Tile();
//            tile[28].image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("tiles/water07.png"));
//
//            tile[29] = new Tile();
//            tile[29].image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("tiles/water08.png"));
//
//            tile[30] = new Tile();
//            tile[30].image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("tiles/water09.png"));
//
//            tile[31] = new Tile();
//            tile[31].image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("tiles/water10.png"));
//
//            tile[32] = new Tile();
//            tile[32].image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("tiles/water11.png"));
//
//            tile[33] = new Tile();
//            tile[33].image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("tiles/water12.png"));
//
//            tile[34] = new Tile();
//            tile[34].image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("tiles/water13.png"));

        } catch (IOException e) {
            e.printStackTrace();

        }
    }

    public void loadMap(String filePath) {

        try {
            InputStream is = getClass().getClassLoader().getResourceAsStream(filePath); // Importing text file
            BufferedReader br = new BufferedReader(new InputStreamReader(is)); // Reading the text file

            int col = 0;
            int row = 0;

            while (col < gp.maxWorldCol && col < gp.maxWorldRow) {

                String line = br.readLine(); // Read a line of .txt

                while (col < gp.maxWorldCol) {

                    String numbers[] = line.split(" "); // Splits up the line everytime there is a space

                    int num = Integer.parseInt(numbers[col]); // Changes the data from String to Integers

                    mapTileNum[col][row] = num;
                    col++; // Continue this until everything in numbers[] is stored in the mapTileNum[]
                }
                if (col == gp.maxWorldCol) {
                    col = 0;
                    row++; // next line
                }
            }
            br.close();

        } catch (Exception e) {

        }
    }

    public void draw(Graphics2D g2) {

        int worldCol = 0;
        int worldRow = 0;


        while(worldCol < gp.maxWorldCol && worldRow < gp.maxWorldRow) {

            int tileNum = mapTileNum[worldCol][worldRow];

            int worldX = worldCol * gp.tileSize;
            int worldY = worldRow * gp.tileSize;
            int screenX = worldX - gp.player.worldX + gp.player.screenX;
            int screenY = worldY - gp.player.worldY + gp.player.screenY;

            // Create a boundary from the center of the gamePanel to the edge of the gamePanel
            // As long as a tile is in the boundary it will be drawn
            if (worldX + gp.tileSize > gp.player.worldX - gp.player.screenX &&
                worldX - gp.tileSize < gp.player.worldX + gp.player.screenX &&
                worldY + gp.tileSize > gp.player.worldY - gp.player.screenY &&
                worldY - gp.tileSize < gp.player.worldY + gp.player.screenY) {

                g2.drawImage(tile[tileNum].image, screenX, screenY, gp.tileSize, gp.tileSize, null);
            }

            worldCol++;


            if (worldCol == gp.maxWorldCol) {
                worldCol = 0;
                worldRow++;

            }
        }
    }
}
