package server;

import lombok.NonNull;
import lombok.SneakyThrows;
import org.bukkit.*;
import org.bukkit.advancement.Advancement;
import org.bukkit.block.data.BlockData;
import org.bukkit.boss.*;
import org.bukkit.command.CommandException;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.command.PluginCommand;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityFactory;
import org.bukkit.entity.Player;
import org.bukkit.entity.SpawnCategory;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.generator.ChunkGenerator;
import org.bukkit.help.HelpMap;
import org.bukkit.inventory.*;
import org.bukkit.loot.LootTable;
import org.bukkit.map.MapView;
import org.bukkit.packs.DataPackManager;
import org.bukkit.packs.ResourcePack;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.ServicesManager;
import org.bukkit.plugin.messaging.Messenger;
import org.bukkit.profile.PlayerProfile;
import org.bukkit.scheduler.BukkitScheduler;
import org.bukkit.scoreboard.Criteria;
import org.bukkit.scoreboard.ScoreboardManager;
import org.bukkit.structure.StructureManager;
import org.bukkit.util.CachedServerIcon;
import player.MockPlayerList;

import javax.naming.OperationNotSupportedException;
import java.awt.image.BufferedImage;
import java.io.File;
import java.net.InetAddress;
import java.util.*;
import java.util.function.Consumer;
import java.util.logging.Logger;

public class ServerMock extends Server.Spigot implements Server{




    private final String serverName = "MockedServer";
    private final String serverVersion = "1.21.1";
    private final String bukkitVersion = "1.21.1-R0.1-SNAPSHOT";

    private final MockPlayerList playerList = new MockPlayerList();

    private final ServerProperties properties = new ServerProperties();

    public ServerMock() {

    }


    @Override
    public String getName() {
        return serverName;
    }

    @Override
    public String getVersion() {
        return serverVersion;
    }

    @Override
    public String getBukkitVersion() {
        return bukkitVersion;
    }

    @Override
    @NonNull
    public Collection<? extends Player> getOnlinePlayers() {
        return playerList.getOnlinePlayers();
    }

    @Override
    public int getMaxPlayers() {
        return playerList.getMaxPlayers();
    }

    @Override
    public void setMaxPlayers(int playerCount) {
        playerList.setMaxPlayers(playerCount);
    }

    @Override
    public int getPort() {
        return properties.getPort();
    }

    @Override
    public int getViewDistance() {
         return properties.getViewDistance();
    }

    @Override
    public int getSimulationDistance() {
        return properties.getSimulationDistance();
    }

    @Override
    public String getIp() {
        return properties.getIpAddress();
    }

    @Override
    public String getWorldType() {
        return properties.getWorldType();
    }

    @Override
    public boolean getGenerateStructures() {
        return properties.shouldGenerateStructures();
    }

    @Override
    public int getMaxWorldSize() {
        return properties.getMaxWorldSize();
    }

    @Override
    public boolean getAllowEnd() {
        return properties.shouldAllowEnd();
    }

    @Override
    public boolean getAllowNether() {
        return properties.shouldAllowNether();
    }

    @Override
    public boolean isLoggingIPs() {
        return properties.isLoggingIPs();
    }

    @Override
    public List<String> getInitialEnabledPacks() {
        return null;
    }

    @Override
    public List<String> getInitialDisabledPacks() {
        return null;
    }


    @Override
    @SneakyThrows
    public DataPackManager getDataPackManager(){
         throw new OperationNotSupportedException("Not supported");
    }

    @Override
    public ServerTickManager getServerTickManager() {
        return null;
    }

    @Override
    public ResourcePack getServerResourcePack() {
        return null;
    }

    @Override
    public String getResourcePack() {
        return null;
    }

    @Override
    public String getResourcePackHash() {
        return null;
    }

    @Override
    public String getResourcePackPrompt() {
        return null;
    }

    @Override
    public boolean isResourcePackRequired() {
        return false;
    }

    @Override
    public boolean hasWhitelist() {
        return false;
    }

    @Override
    public void setWhitelist(boolean b) {

    }

    @Override
    public boolean isWhitelistEnforced() {
        return false;
    }

    @Override
    public void setWhitelistEnforced(boolean b) {

    }

    @Override
    public Set<OfflinePlayer> getWhitelistedPlayers() {
        return null;
    }

    @Override
    public void reloadWhitelist() {

    }

    @Override
    public int broadcastMessage(String s) {
        return 0;
    }

    @Override
    public String getUpdateFolder() {
        return null;
    }

    @Override
    public File getUpdateFolderFile() {
        return null;
    }

    @Override
    public long getConnectionThrottle() {
        return 0;
    }

    @Override
    public int getTicksPerAnimalSpawns() {
        return 0;
    }

    @Override
    public int getTicksPerMonsterSpawns() {
        return 0;
    }

    @Override
    public int getTicksPerWaterSpawns() {
        return 0;
    }

    @Override
    public int getTicksPerWaterAmbientSpawns() {
        return 0;
    }

    @Override
    public int getTicksPerWaterUndergroundCreatureSpawns() {
        return 0;
    }

    @Override
    public int getTicksPerAmbientSpawns() {
        return 0;
    }

    @Override
    public int getTicksPerSpawns(SpawnCategory spawnCategory) {
        return 0;
    }

    @Override
    public Player getPlayer(String s) {
        return null;
    }

    @Override
    public Player getPlayerExact(String s) {
        return null;
    }

    @Override
    public List<Player> matchPlayer(String s) {
        return null;
    }

    @Override
    public Player getPlayer(UUID uuid) {
        return null;
    }

    @Override
    public PluginManager getPluginManager() {
        return null;
    }

    @Override
    public BukkitScheduler getScheduler() {
        return null;
    }

    @Override
    public ServicesManager getServicesManager() {
        return null;
    }

    @Override
    public List<World> getWorlds() {
        return null;
    }

    @Override
    public World createWorld(WorldCreator worldCreator) {
        return null;
    }

    @Override
    public boolean unloadWorld(String s, boolean b) {
        return false;
    }

    @Override
    public boolean unloadWorld(World world, boolean b) {
        return false;
    }

    @Override
    public World getWorld(String s) {
        return null;
    }

    @Override
    public World getWorld(UUID uuid) {
        return null;
    }

    @Override
    public WorldBorder createWorldBorder() {
        return null;
    }

    @Override
    public MapView getMap(int i) {
        return null;
    }

    @Override
    public MapView createMap(World world) {
        return null;
    }

    @Override
    public ItemStack createExplorerMap(World world, Location location, StructureType structureType) {
        return null;
    }

    @Override
    public ItemStack createExplorerMap(World world, Location location, StructureType structureType, int i, boolean b) {
        return null;
    }

    @Override
    public void reload() {

    }

    @Override
    public void reloadData() {

    }

    @Override
    public Logger getLogger() {
        return null;
    }

    @Override
    public PluginCommand getPluginCommand(String s) {
        return null;
    }

    @Override
    public void savePlayers() {

    }

    @Override
    public boolean dispatchCommand(CommandSender commandSender, String s) throws CommandException {
        return false;
    }

    @Override
    public boolean addRecipe(Recipe recipe) {
        return false;
    }

    @Override
    public List<Recipe> getRecipesFor(ItemStack itemStack) {
        return null;
    }

    @Override
    public Recipe getRecipe(NamespacedKey namespacedKey) {
        return null;
    }

    @Override
    public Recipe getCraftingRecipe(ItemStack[] itemStacks, World world) {
        return null;
    }

    @Override
    public ItemStack craftItem(ItemStack[] itemStacks, World world, Player player) {
        return null;
    }

    @Override
    public ItemStack craftItem(ItemStack[] itemStacks, World world) {
        return null;
    }

    @Override
    public ItemCraftResult craftItemResult(ItemStack[] itemStacks, World world, Player player) {
        return null;
    }

    @Override
    public ItemCraftResult craftItemResult(ItemStack[] itemStacks, World world) {
        return null;
    }

    @Override
    public Iterator<Recipe> recipeIterator() {
        return null;
    }

    @Override
    public void clearRecipes() {

    }

    @Override
    public void resetRecipes() {

    }

    @Override
    public boolean removeRecipe(NamespacedKey namespacedKey) {
        return false;
    }

    @Override
    public Map<String, String[]> getCommandAliases() {
        return null;
    }

    @Override
    public int getSpawnRadius() {
        return 0;
    }

    @Override
    public void setSpawnRadius(int i) {

    }

    @Override
    public boolean shouldSendChatPreviews() {
        return false;
    }

    @Override
    public boolean isEnforcingSecureProfiles() {
        return false;
    }

    @Override
    public boolean isAcceptingTransfers() {
        return false;
    }

    @Override
    public boolean getHideOnlinePlayers() {
        return false;
    }

    @Override
    public boolean getOnlineMode() {
        return false;
    }

    @Override
    public boolean getAllowFlight() {
        return false;
    }

    @Override
    public boolean isHardcore() {
        return false;
    }

    @Override
    public void shutdown() {

    }

    @Override
    public int broadcast(String s, String s1) {
        return 0;
    }

    @Override
    public OfflinePlayer getOfflinePlayer(String s) {
        return null;
    }

    @Override
    public OfflinePlayer getOfflinePlayer(UUID uuid) {
        return null;
    }

    @Override
    public PlayerProfile createPlayerProfile(UUID uuid, String s) {
        return null;
    }

    @Override
    public PlayerProfile createPlayerProfile(UUID uuid) {
        return null;
    }

    @Override
    public PlayerProfile createPlayerProfile(String s) {
        return null;
    }

    @Override
    public Set<String> getIPBans() {
        return null;
    }

    @Override
    public void banIP(String s) {

    }

    @Override
    public void unbanIP(String s) {

    }

    @Override
    public void banIP(InetAddress inetAddress) {

    }

    @Override
    public void unbanIP(InetAddress inetAddress) {

    }

    @Override
    public Set<OfflinePlayer> getBannedPlayers() {
        return null;
    }

    @Override
    public <T extends BanList<?>> T getBanList(BanList.Type type) {
        return null;
    }

    @Override
    public Set<OfflinePlayer> getOperators() {
        return null;
    }

    @Override
    public GameMode getDefaultGameMode() {
        return null;
    }

    @Override
    public void setDefaultGameMode(GameMode gameMode) {

    }

    @Override
    public ConsoleCommandSender getConsoleSender() {
        return null;
    }

    @Override
    public File getWorldContainer() {
        return null;
    }

    @Override
    public OfflinePlayer[] getOfflinePlayers() {
        return new OfflinePlayer[0];
    }

    @Override
    public Messenger getMessenger() {
        return null;
    }

    @Override
    public HelpMap getHelpMap() {
        return null;
    }

    @Override
    public Inventory createInventory(InventoryHolder inventoryHolder, InventoryType inventoryType) {
        return null;
    }

    @Override
    public Inventory createInventory(InventoryHolder inventoryHolder, InventoryType inventoryType, String s) {
        return null;
    }

    @Override
    public Inventory createInventory(InventoryHolder inventoryHolder, int i) throws IllegalArgumentException {
        return null;
    }

    @Override
    public Inventory createInventory(InventoryHolder inventoryHolder, int i, String s) throws IllegalArgumentException {
        return null;
    }

    @Override
    public Merchant createMerchant(String s) {
        return null;
    }

    @Override
    public int getMaxChainedNeighborUpdates() {
        return 0;
    }

    @Override
    public int getMonsterSpawnLimit() {
        return 0;
    }

    @Override
    public int getAnimalSpawnLimit() {
        return 0;
    }

    @Override
    public int getWaterAnimalSpawnLimit() {
        return 0;
    }

    @Override
    public int getWaterAmbientSpawnLimit() {
        return 0;
    }

    @Override
    public int getWaterUndergroundCreatureSpawnLimit() {
        return 0;
    }

    @Override
    public int getAmbientSpawnLimit() {
        return 0;
    }

    @Override
    public int getSpawnLimit(SpawnCategory spawnCategory) {
        return 0;
    }

    @Override
    public boolean isPrimaryThread() {
        return false;
    }

    @Override
    public String getMotd() {
        return null;
    }

    @Override
    public void setMotd(String s) {

    }

    @Override
    public ServerLinks getServerLinks() {
        return null;
    }

    @Override
    public String getShutdownMessage() {
        return null;
    }

    @Override
    public Warning.WarningState getWarningState() {
        return null;
    }

    @Override
    public ItemFactory getItemFactory() {
        return null;
    }

    @Override
    public EntityFactory getEntityFactory() {
        return null;
    }

    @Override
    public ScoreboardManager getScoreboardManager() {
        return null;
    }

    @Override
    public Criteria getScoreboardCriteria(String s) {
        return null;
    }

    @Override
    public CachedServerIcon getServerIcon() {
        return null;
    }

    @Override
    public CachedServerIcon loadServerIcon(File file) throws IllegalArgumentException, Exception {
        return null;
    }

    @Override
    public CachedServerIcon loadServerIcon(BufferedImage bufferedImage) throws IllegalArgumentException, Exception {
        return null;
    }

    @Override
    public void setIdleTimeout(int i) {

    }

    @Override
    public int getIdleTimeout() {
        return 0;
    }

    @Override
    public ChunkGenerator.ChunkData createChunkData(World world) {
        return null;
    }

    @Override
    public BossBar createBossBar(String s, BarColor barColor, BarStyle barStyle, BarFlag... barFlags) {
        return null;
    }

    @Override
    public KeyedBossBar createBossBar(NamespacedKey namespacedKey, String s, BarColor barColor, BarStyle barStyle, BarFlag... barFlags) {
        return null;
    }

    @Override
    public Iterator<KeyedBossBar> getBossBars() {
        return null;
    }

    @Override
    public KeyedBossBar getBossBar(NamespacedKey namespacedKey) {
        return null;
    }

    @Override
    public boolean removeBossBar(NamespacedKey namespacedKey) {
        return false;
    }

    @Override
    public Entity getEntity(UUID uuid) {
        return null;
    }

    @Override
    public Advancement getAdvancement(NamespacedKey namespacedKey) {
        return null;
    }

    @Override
    public Iterator<Advancement> advancementIterator() {
        return null;
    }

    @Override
    public BlockData createBlockData(Material material) {
        return null;
    }

    @Override
    public BlockData createBlockData(Material material, Consumer<? super BlockData> consumer) {
        return null;
    }

    @Override
    public BlockData createBlockData(String s) throws IllegalArgumentException {
        return null;
    }

    @Override
    public BlockData createBlockData(Material material, String s) throws IllegalArgumentException {
        return null;
    }

    @Override
    public <T extends Keyed> Tag<T> getTag(String s, NamespacedKey namespacedKey, Class<T> aClass) {
        return null;
    }

    @Override
    public <T extends Keyed> Iterable<Tag<T>> getTags(String s, Class<T> aClass) {
        return null;
    }

    @Override
    public LootTable getLootTable(NamespacedKey namespacedKey) {
        return null;
    }

    @Override
    public List<Entity> selectEntities(CommandSender commandSender, String s) throws IllegalArgumentException {
        return null;
    }

    @Override
    public StructureManager getStructureManager() {
        return null;
    }

    @Override
    public <T extends Keyed> Registry<T> getRegistry(Class<T> aClass) {
        return null;
    }

    @Override
    public UnsafeValues getUnsafe() {
        return null;
    }

    @Override
    public Spigot spigot() {
        return null;
    }

    @Override
    public void sendPluginMessage(Plugin plugin, String s, byte[] bytes) {

    }

    @Override
    public Set<String> getListeningPluginChannels() {
        return null;
    }
}
