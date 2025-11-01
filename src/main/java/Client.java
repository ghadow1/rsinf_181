import netscape.javascript.JSObject;

import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public final class Client extends GameApplet implements class280 {

   static boolean packetDebugging = false;

   static class235 field683;
   static class235 field684;
   static int field729;
   static boolean field912 = true;
   public static int field807 = 1;
   static int field653 = 0;
   static int field703 = 0;
   public static boolean field655 = false;
   static boolean resizeSettings2 = false;
   static int platformType = -1;
   static boolean field658 = false;
   static int field662 = 0;
   static boolean field661 = true;
   static int cycle = 0;
   static long field663 = 1L;
   static int field717 = -1;
   static int field665 = -1;
   static long field666 = -1L;
   static boolean field667 = true;
   static boolean field884 = false;
   static int field669 = 0;
   static int field708 = 0;
   static int field824 = 0;
   static int field689 = 0;
   static int field737 = 0;
   static int field777 = 0;
   static int field675 = 0;
   static int field821 = 0;
   static int field677 = 0;
   static class84 field678;
   static class84 field679;
   static int field680;
   static int field681;
   static int field682;
   static int field685;
   static int stateLogin;
   static int field687;
   static int field688;
   static int field836;
   static class160 authentication;
   static boolean field691;
   static class88 field692;
   static byte[] field693;
   static NPC[] npcs;
   static int npcCount;
   static int[] npcIndices;
   static int field697;
   static int[] field859;
   public static final PacketWriter data;
   static int field700;
   static boolean field701;
   static boolean field815;
   static Timer timer;
   static HashMap fontsMap;
   static int field705;
   static int field706;
   static int field707;
   static int field896;
   static int field709;
   static CollisionMap[] field710;
   static boolean field798;
   static int[][][] field712;
   static final int[] field713;
   static int field718;
   static int field715;
   static int field716;
   static int field720;
   static int field772;
   static boolean field719;
   static int field882;
   static int field721;
   static int camAngleY;
   static int field723;
   static int field724;
   static int field725;
   static int field726;
   static int field727;
   static int field728;
   static int field928;
   static int field731;
   static int field871;
   static int field733;
   static int field734;
   static int field855;
   static boolean field736;
   static int field822;
   static boolean field878;
   static int field739;
   static int field740;
   static int field867;
   static int[] field742;
   static int[] field743;
   static int[] field744;
   static int[] field676;
   static int[] field702;
   static int[] field805;
   static int[] field748;
   static String[] field749;
   static int[][] field750;
   static int field751;
   static int field752;
   static int field753;
   static int field876;
   static int field755;
   static int field756;
   static int field757;
   static boolean field758;
   static int field759;
   static int field698;
   static int field765;
   static int field654;
   static int field763;
   static int field764;
   static boolean field874;
   static int field766;
   static int field767;
   static boolean field784;
   static class66[] field909;
   static int field770;
   static int field771;
   static boolean field773;
   static int field774;
   static int field775;
   static int[] field776;
   static final int[] field811;
   static String[] field778;
   static boolean[] field779;
   static int[] field780;
   static int field781;
   static NodeDeque[][][] groundItems;
   static NodeDeque field783;
   static NodeDeque projectiles;
   static NodeDeque field785;
   static int[] field760;
   static int[] field787;
   static int[] field788;
   static int field789;
   static boolean field674;
   static int menuOptionsCount;
   static int[] field792;
   static int[] field793;
   static int[] menuOpcodes;
   static int[] field795;
   static String[] field796;
   static String[] field668;
   static boolean[] field769;
   static boolean field799;
   static boolean field800;
   static boolean flag_23;
   static boolean field802;
   static int field803;
   static int field804;
   static int field840;
   static int field833;
   static int isItemSelected;
   static String selectedItemName;
   static boolean isSpellSelected;
   static int field848;
   static int field812;
   static String field813;
   static String selectedSpellName;
   static int field905;
   static class318 field816;
   static int field817;
   static int field818;
   static int field819;
   static int field809;
   static Widget field850;
   static int field910;
   static int field823;
   public static int localRights;
   static int field825;
   static boolean field826;
   static Widget field827;
   static Widget field828;
   static Widget field829;
   static int field830;
   static int field831;
   static Widget field832;
   static boolean field873;
   static int field834;
   static int field835;
   static boolean field745;
   static int field837;
   static int field838;
   static boolean field839;
   static int field673;
   static int[] field863;
   static int field806;
   static int[] field888;
   static int field671;
   static int[] field845;
   static int field846;
   static int field847;
   static int field672;
   static int field849;
   static int field915;
   static int field851;
   static int field844;
   static int field853;
   static NodeDeque field854;
   static NodeDeque field852;
   static NodeDeque field856;
   static class318 field857;
   static int field858;
   static int field741;
   static boolean[] field843;
   static boolean[] field861;
   static boolean[] field862;
   static int[] field808;
   static int[] field864;
   static int[] field865;
   static int[] field860;
   static int field768;
   static long field868;
   static boolean resizeSettings;
   static int[] field870;
   static int field907;
   static int field872;
   static String field762;
   static long[] field922;
   static int field875;
   static int field754;
   static int[] field877;
   static int[] field921;
   static long field879;
   static int field747;
   static int mapIconCount;
   static int[] mapIconXs;
   static int[] mapIconYs;
   static class325[] field786;
   static int destinationX;
   static int destinationY;
   static int minimapState;
   static int field911;
   static int field889;
   static boolean field699;
   static int field891;
   static int field892;
   static int field893;
   static int[] field894;
   static int[] field895;
   static int[] field897;
   static int[] field841;
   static class101[] field898;
   static boolean field899;
   static boolean[] field886;
   static int[] field901;
   static int[] field902;
   static int[] field903;
   static int[] field904;
   static short field782;
   static short field651;
   static short field906;
   static short field908;
   static short field820;
   static short field790;
   static short field732;
   static short field659;
   static int field913;
   static int field914;
   static int field746;
   static int field714;
   static int field917;
   static class214 field918;
   static int field919;
   static int field920;
   static class330 field711;
   static class9[] field866;
   static class67 field923;
   public static int field924;
   static ArrayList field925;
   static int field926;
   static int field927;
   static final class65 field735;
   static int[] field929;
   static int[] field930;
   static class82 field916;
   static class66 localPlayer;

   static {
      field678 = class84.field1170;
      field679 = class84.field1170;
      field680 = 0;
      field681 = 0;
      field682 = 0;
      field685 = 0;
      stateLogin = 0;
      field687 = 0;
      field688 = 0;
      field836 = 0;
      authentication = class160.field2001;
      field691 = false;
      field692 = new class88();
      field693 = null;
      npcs = new NPC[32768];
      npcCount = 0;
      npcIndices = new int[32768];
      field697 = 0;
      field859 = new int[250];
      data = new PacketWriter();
      field700 = 0;
      field701 = false;
      field815 = true;
      timer = new Timer();
      fontsMap = new HashMap();
      field705 = 0;
      field706 = 1;
      field707 = 0;
      field896 = 1;
      field709 = 0;
      field710 = new CollisionMap[4];
      field798 = false;
      field712 = new int[4][13][13];
      field713 = new int[] {0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3};
      field718 = 0;
      field715 = 2301979;
      field716 = 5063219;
      field720 = 3353893;
      field772 = 7759444;
      field719 = false;
      field882 = 0;
      field721 = 128;
      camAngleY = 0;
      field723 = 0;
      field724 = 0;
      field725 = 0;
      field726 = 0;
      field727 = 0;
      field728 = 50;
      field928 = 0;
      field731 = 0;
      field871 = 0;
      field733 = 12;
      field734 = 6;
      field855 = 0;
      field736 = false;
      field822 = 0;
      field878 = false;
      field739 = 0;
      field740 = 0;
      field867 = 50;
      field742 = new int[field867];
      field743 = new int[field867];
      field744 = new int[field867];
      field676 = new int[field867];
      field702 = new int[field867];
      field805 = new int[field867];
      field748 = new int[field867];
      field749 = new String[field867];
      field750 = new int[104][104];
      field751 = 0;
      field752 = -1;
      field753 = -1;
      field876 = 0;
      field755 = 0;
      field756 = 0;
      field757 = 0;
      field758 = true;
      field759 = 0;
      field698 = 0;
      field765 = 0;
      field654 = 0;
      field763 = 0;
      field764 = 0;
      field874 = false;
      field766 = 0;
      field767 = 0;
      field784 = true;
      field909 = new class66[2048];
      field770 = -1;
      field771 = 0;
      field773 = true;
      field774 = 0;
      field775 = 0;
      field776 = new int[1000];
      field811 = new int[] {44, 45, 46, 47, 48, 49, 50, 51};
      field778 = new String[8];
      field779 = new boolean[8];
      field780 = new int[] {768, 1024, 1280, 512, 1536, 256, 0, 1792};
      field781 = -1;
      groundItems = new NodeDeque[4][104][104];
      field783 = new NodeDeque();
      projectiles = new NodeDeque();
      field785 = new NodeDeque();
      field760 = new int[25];
      field787 = new int[25];
      field788 = new int[25];
      field789 = 0;
      field674 = false;
      menuOptionsCount = 0;
      field792 = new int[500];
      field793 = new int[500];
      menuOpcodes = new int[500];
      field795 = new int[500];
      field796 = new String[500];
      field668 = new String[500];
      field769 = new boolean[500];
      field799 = false;
      field800 = false;
      flag_23 = false;
      field802 = true;
      field803 = -1;
      field804 = -1;
      field840 = 0;
      field833 = 50;
      isItemSelected = 0;
      selectedItemName = null;
      isSpellSelected = false;
      field848 = -1;
      field812 = -1;
      field813 = null;
      selectedSpellName = null;
      field905 = -1;
      field816 = new class318(8);
      field817 = 0;
      field818 = -1;
      field819 = 0;
      field809 = 0;
      field850 = null;
      field910 = 0;
      field823 = 0;
      localRights = 0;
      field825 = -1;
      field826 = false;
      field827 = null;
      field828 = null;
      field829 = null;
      field830 = 0;
      field831 = 0;
      field832 = null;
      field873 = false;
      field834 = -1;
      field835 = -1;
      field745 = false;
      field837 = -1;
      field838 = -1;
      field839 = false;
      field673 = 1;
      field863 = new int[32];
      field806 = 0;
      field888 = new int[32];
      field671 = 0;
      field845 = new int[32];
      field846 = 0;
      field847 = 0;
      field672 = 0;
      field849 = 0;
      field915 = 0;
      field851 = 0;
      field844 = 0;
      field853 = 0;
      field854 = new NodeDeque();
      field852 = new NodeDeque();
      field856 = new NodeDeque();
      field857 = new class318(512);
      field858 = 0;
      field741 = -2;
      field843 = new boolean[100];
      field861 = new boolean[100];
      field862 = new boolean[100];
      field808 = new int[100];
      field864 = new int[100];
      field865 = new int[100];
      field860 = new int[100];
      field768 = 0;
      field868 = 0L;
      resizeSettings = true;
      field870 = new int[] {16776960, 16711680, 65280, 65535, 16711935, 16777215};
      field907 = 0;
      field872 = 0;
      field762 = "";
      field922 = new long[100];
      field875 = 0;
      field754 = 0;
      field877 = new int[128];
      field921 = new int[128];
      field879 = -1L;
      field747 = -1;
      mapIconCount = 0;
      mapIconXs = new int[1000];
      mapIconYs = new int[1000];
      field786 = new class325[1000];
      destinationX = 0;
      destinationY = 0;
      minimapState = 0;
      field911 = 255;
      field889 = -1;
      field699 = false;
      field891 = 127;
      field892 = 127;
      field893 = 0;
      field894 = new int[50];
      field895 = new int[50];
      field897 = new int[50];
      field841 = new int[50];
      field898 = new class101[50];
      field899 = false;
      field886 = new boolean[5];
      field901 = new int[5];
      field902 = new int[5];
      field903 = new int[5];
      field904 = new int[5];
      field782 = 256;
      field651 = 205;
      field906 = 256;
      field908 = 320;
      field820 = 1;
      field790 = 32767;
      field732 = 1;
      field659 = 32767;
      field913 = 0;
      field914 = 0;
      field746 = 0;
      field714 = 0;
      field917 = 0;
      field918 = new class214();
      field919 = -1;
      field920 = -1;
      field711 = new class329();
      field866 = new class9[8];
      field923 = new class67();
      field924 = -1;
      field925 = new ArrayList(10);
      field926 = 0;
      field927 = 0;
      field735 = new class65();
      field929 = new int[50];
      field930 = new int[50];
   }

   public static Widget method1649(int i_0, int i_1) {
      Widget widget_3 = WorldMapElement.getWidget(i_0);
      return i_1 == -1 ? widget_3 : (widget_3 != null && widget_3.field2675 != null && i_1 < widget_3.field2675.length ? widget_3.field2675[i_1] : null);
   }

   static void method1651(World[] arr_0, int i_1, int i_2, int[] ints_3, int[] ints_4) {
      if (i_1 < i_2) {
         int i_6 = i_1 - 1;
         int i_7 = i_2 + 1;
         int i_8 = (i_2 + i_1) / 2;
         World world_9 = arr_0[i_8];
         arr_0[i_8] = arr_0[i_1];
         arr_0[i_1] = world_9;

         while (i_6 < i_7) {
            boolean bool_10 = true;

            int i_11;
            int i_12;
            int i_13;
            do {
               --i_7;

               for (i_11 = 0; i_11 < 4; i_11++) {
                  if (ints_3[i_11] == 2) {
                     i_12 = arr_0[i_7].field1034;
                     i_13 = world_9.field1034;
                  } else if (ints_3[i_11] == 1) {
                     i_12 = arr_0[i_7].field1030;
                     i_13 = world_9.field1030;
                     if (i_12 == -1 && ints_4[i_11] == 1) {
                        i_12 = 2001;
                     }

                     if (i_13 == -1 && ints_4[i_11] == 1) {
                        i_13 = 2001;
                     }
                  } else if (ints_3[i_11] == 3) {
                     i_12 = arr_0[i_7].method1680() ? 1 : 0;
                     i_13 = world_9.method1680() ? 1 : 0;
                  } else {
                     i_12 = arr_0[i_7].id;
                     i_13 = world_9.id;
                  }

                  if (i_13 != i_12) {
                     if ((ints_4[i_11] != 1 || i_12 <= i_13) && (ints_4[i_11] != 0 || i_12 >= i_13)) {
                        bool_10 = false;
                     }
                     break;
                  }

                  if (i_11 == 3) {
                     bool_10 = false;
                  }
               }
            } while (bool_10);

            bool_10 = true;

            do {
               ++i_6;

               for (i_11 = 0; i_11 < 4; i_11++) {
                  if (ints_3[i_11] == 2) {
                     i_12 = arr_0[i_6].field1034;
                     i_13 = world_9.field1034;
                  } else if (ints_3[i_11] == 1) {
                     i_12 = arr_0[i_6].field1030;
                     i_13 = world_9.field1030;
                     if (i_12 == -1 && ints_4[i_11] == 1) {
                        i_12 = 2001;
                     }

                     if (i_13 == -1 && ints_4[i_11] == 1) {
                        i_13 = 2001;
                     }
                  } else if (ints_3[i_11] == 3) {
                     i_12 = arr_0[i_6].method1680() ? 1 : 0;
                     i_13 = world_9.method1680() ? 1 : 0;
                  } else {
                     i_12 = arr_0[i_6].id;
                     i_13 = world_9.id;
                  }

                  if (i_12 != i_13) {
                     if ((ints_4[i_11] != 1 || i_12 >= i_13) && (ints_4[i_11] != 0 || i_12 <= i_13)) {
                        bool_10 = false;
                     }
                     break;
                  }

                  if (i_11 == 3) {
                     bool_10 = false;
                  }
               }
            } while (bool_10);

            if (i_6 < i_7) {
               World world_14 = arr_0[i_6];
               arr_0[i_6] = arr_0[i_7];
               arr_0[i_7] = world_14;
            }
         }

         method1651(arr_0, i_1, i_7, ints_3, ints_4);
         method1651(arr_0, i_7 + 1, i_2, ints_3, ints_4);
      }

   }

   static final void method1650(String string_0) {
      StringBuilder stringbuilder_10000 = (new StringBuilder()).append(string_0);
      String string_2 = stringbuilder_10000.append(" is already on your ignore list").toString();
      MusicPatchPcmStream.method1132(30, "", string_2);
   }

   public Username vmethod5179(byte b_1) {
      return localPlayer != null ? localPlayer.field621 : null;
   }

   void method1253() {
      int i_2 = class7.clientWidth;
      int i_3 = ParamComposition.clientHeight;
      if (super.field454 < i_2) {
         i_2 = super.field454;
      }

      if (super.field455 < i_3) {
         i_3 = super.field455;
      }

      if (class17.field117 != null) {
         try {
            class47.method806(WorldMapID.client, "resize", new Object[]{Integer.valueOf(class34.method598())});
         } catch (Throwable throwable_5) {
            ;
         }
      }

   }

   protected final void vmethod1608() {
      if (class170.field2057.method2099()) {
         class170.field2057.method2100();
      }

      if (FontName.field348 != null) {
         FontName.field348.field590 = false;
      }

      FontName.field348 = null;
      data.method2233();
      class123.method2842();
      Widget.method4091();
      class36.field329 = null;
      if (WorldMapElement.field1144 != null) {
         WorldMapElement.field1144.method2434();
      }

      if (class190.field2361 != null) {
         class190.field2361.method2434();
      }

      if (class236.field3176 != null) {
         class236.field3176.close();
      }

      class89.method2093((byte) 0);
      if (SequenceAnimation.field3534 != null) {
         SequenceAnimation.field3534.method3297((byte) 78);
         SequenceAnimation.field3534 = null;
      }

      try {
         class167.field2042.method6540();

         for (int i_2 = 0; i_2 < FontName.field350; i_2++) {
            class167.field2041[i_2].method6540();
         }

         class167.field2039.method6540();
         class167.field2040.method6540();
      } catch (Exception exception_4) {
         ;
      }

   }

   void method1247() {
      if (field662 != 1000) {
         boolean bool_2 = item.method365();
         if (!bool_2) {
            this.method1248();
         }

      }
   }

   final void method1293(boolean bool_1) {
      WorldMapID.method416(field905, class7.clientWidth, ParamComposition.clientHeight, bool_1);
   }

   protected final void vmethod1243(int i_1) {
      int[] ints_2 = new int[] {20, 260, 10000};
      int[] ints_3 = new int[] {1000, 100, 500};
      if (ints_2 != null && ints_3 != null) {
         BufferPool.customSizes = ints_2;
         GCMonitor.customPoolCounts = new int[ints_2.length];
         BufferPoolConfig.customPools = new byte[ints_2.length][][];

         for (int i_4 = 0; i_4 < BufferPool.customSizes.length; i_4++) {
            BufferPoolConfig.customPools[i_4] = new byte[ints_3[i_4]][];
         }
      } else {
         BufferPool.customSizes = null;
         GCMonitor.customPoolCounts = null;
         BufferPoolConfig.customPools = null;
      }

      class190.field2358 = field703 == 0 ? 43594 : field807 + 40000;
      class132.field1800 = field703 == 0 ? 443 : field807 + 50000;
      class90.field1266 = class190.field2358;
      BuddyRankComparator.field1870 = SoundSystem.field2540;
      class247.field3291 = SoundSystem.field2541;
      WorldMapCacheName.field309 = SoundSystem.field2542;
      Message.field604 = SoundSystem.field2546;
      SequenceAnimation.field3534 = new class143();
      this.method972();
      this.method932();
      class36.field329 = this.method877();
      MusicPatchPcmStream.field573 = new class308(255, class167.field2042, class167.field2039, 500000);
      class17.field117 = BuddyRankComparator.method3249();
      this.method878();
      class218.method4110(this, class60.field566);
      if (field703 != 0) {
         field884 = true;
      }

      class170.method3515(class17.field117.field1064);
      class58.field546 = new class74(FontName.loginType);
   }

   protected final void vmethod1273(int i_1) {
   }

   void method1249(int i_1) {
      class191.field2363 = null;
      class70.field1015 = null;
      field681 = 0;
      if (class190.field2358 == class90.field1266) {
         class90.field1266 = class132.field1800;
      } else {
         class90.field1266 = class190.field2358;
      }

      ++field685;
      if (field685 >= 2 && (i_1 == 7 || i_1 == 9)) {
         if (field662 <= 5) {
            this.loadingError("js5connect_full");
            field662 = 1000;
         } else {
            field682 = 3000;
         }
      } else if (field685 >= 2 && i_1 == 6) {
         this.loadingError("js5connect_outofdate");
         field662 = 1000;
      } else if (field685 >= 4) {
         if (field662 <= 5) {
            this.loadingError("js5connect");
            field662 = 1000;
         } else {
            field682 = 3000;
         }
      }

   }

   final boolean method1257() {
      int i_2 = class13.getNewestMenuIdx();
      return (field789 == 1 && menuOptionsCount > 2 || MouseRecorder.isRightClickOnlyMenu(i_2)) && !field769[i_2];
   }

   final boolean parsePacket() {
      AbstractSocket class305_3 = Client.data.getSocket();  // Network input stream
      PacketBuffer jagbuf = Client.data.packetBuffer;  // Raw buffer container
      if (class305_3 == null) {
         return false;
      } else {
         int i_18;
         String string_19;
         try {
            int i_6;
            if (Client.data.serverPacket == null) {
               if (Client.data.field1322) { // Need to read packet ID
                  if (!class305_3.isAvailable(1)) {
                     return false;  // Not enough data available (need 1 byte)
                  }

                  // Read 1 byte (packet opcode) into buffer
                  class305_3.read(Client.data.packetBuffer.buffer, 0, 1);
                  Client.data.field1318 = 0; // Reset read counter
                  Client.data.field1322 = false; // Mark header as read
               }

               jagbuf.position = 0;
               if (jagbuf.method5441()) {
                  if (!class305_3.isAvailable(1)) {
                     return false;
                  }

                  class305_3.read(Client.data.packetBuffer.buffer, 1, 1);
                  Client.data.field1318 = 0;
               }

               Client.data.field1322 = true;
               ServerPacketProt[] arr_5 = MouseRecorder.packetValues();
               i_6 = jagbuf.readSmartByteShortIsaac();
               if (i_6 < 0 || i_6 >= arr_5.length) {
                  throw new IOException(i_6 + " " + jagbuf.position);
               }

               Client.data.serverPacket = arr_5[i_6];
               Client.data.serverPacketLength = Client.data.serverPacket.length;
            }

            if (Client.data.serverPacketLength == -1) {
               if (!class305_3.isAvailable(1)) {
                  return false;
               }

               Client.data.getSocket().read(jagbuf.buffer, 0, 1);
               Client.data.serverPacketLength = jagbuf.buffer[0] & 0xff;
            }

            if (Client.data.serverPacketLength == -2) {
               if (!class305_3.isAvailable(2)) {
                  return false;
               }

               Client.data.getSocket().read(jagbuf.buffer, 0, 2);
               jagbuf.position = 0;
               Client.data.serverPacketLength = jagbuf.readUnsignedShort();
            }

            if (!class305_3.isAvailable(Client.data.serverPacketLength)) {
               return false;
            }

            jagbuf.position = 0;
            class305_3.read(jagbuf.buffer, 0, Client.data.serverPacketLength);
            Client.data.field1318 = 0;
            timer.method5005();
            Client.data.field1317 = Client.data.field1321;
            Client.data.field1321 = Client.data.field1309;
            Client.data.field1309 = Client.data.serverPacket;
            Widget widget_7;
            int pos_node;
            boolean packet_boolean_234;
            if (ServerPacketProt.ifSetHideMessage == Client.data.serverPacket) {
               pos_node = jagbuf.readIntMedEndian();
               packet_boolean_234 = jagbuf.readUnsignedByte() == 1;
               widget_7 = WorldMapElement.getWidget(pos_node);
               if (packet_boolean_234 != widget_7.field2706) {
                  widget_7.field2706 = packet_boolean_234;
                  Widget2.invalidateWidget(widget_7);
               }

               Client.data.serverPacket = null;
               return true;
            }

            if (ServerPacketProt.field2115 == Client.data.serverPacket) {
               minimapState = jagbuf.readUnsignedByte();
               Client.data.serverPacket = null;
               return true;
            }

            if (ServerPacketProt.field2200 == Client.data.serverPacket) {
               pos_node = jagbuf.readUnsignedByte();
               class108.method2491(pos_node);
               Client.data.serverPacket = null;
               return false;
            }

            if (ServerPacketProt.locDelMessage == Client.data.serverPacket) {
               System.out.println("LOC DELETE");
               SceneNode.addSceneNode(RenderableSceneNode.field2320);
               Client.data.serverPacket = null;
               return true;
            }

            if (ServerPacketProt.varpSmallMessage == Client.data.serverPacket) {
               byte b_61 = jagbuf.readOffsetByte();
               i_6 = jagbuf.readShortWithOffset();
               class212.field2524[i_6] = b_61;
               if (class212.var_configurations[i_6] != b_61) {
                  class212.var_configurations[i_6] = b_61;
               }

               class10.method124(i_6);
               field863[++field806 - 1 & 0x1f] = i_6;
               Client.data.serverPacket = null;
               return true;
            }

            if (ServerPacketProt.updateZonePartialFollowsMessage == Client.data.serverPacket) {
               class311.localSceneX = jagbuf.readNegatedUnsignedByte();
               UserComparator10.localSceneY = jagbuf.readInvertedUnsignedByte();
               Client.data.serverPacket = null;
               return true;
            }

            if (ServerPacketProt.field2161 == Client.data.serverPacket) {
               pos_node = jagbuf.readShortLittleEndian();
               class120.method2764(pos_node);
               field888[++field671 - 1 & 0x1f] = pos_node & 0x7fff;
               Client.data.serverPacket = null;
               return true;
            }

            if (ServerPacketProt.field2149 == Client.data.serverPacket) {
               pos_node = jagbuf.readUnsignedByte();
               class192.method3675(pos_node);
               Client.data.serverPacket = null;
               return true;
            }

            if (ServerPacketProt.field2137 == Client.data.serverPacket) {
               SceneNode.addSceneNode(RenderableSceneNode.field2315);
               Client.data.serverPacket = null;
               return true;
            }

            if (ServerPacketProt.updateRebootTimerMessage == Client.data.serverPacket) {
               field669 = jagbuf.readUnsignedShort() * 30;
               field844 = field673;
               Client.data.serverPacket = null;
               return true;
            }

            int i_8;
            Widget widget_9;
            if (ServerPacketProt.field2123 == Client.data.serverPacket) {
               pos_node = jagbuf.readShortWithOffset2();
               i_6 = jagbuf.readShortWithOffset2();
               i_18 = jagbuf.readShortWithOffset2();
               i_8 = jagbuf.readIntCustomOrder();
               widget_9 = WorldMapElement.getWidget(i_8);
               if (pos_node != widget_9.field2615 || i_18 != widget_9.field2616 || i_6 != widget_9.field2618) {
                  widget_9.field2615 = pos_node;
                  widget_9.field2616 = i_18;
                  widget_9.field2618 = i_6;
                  Widget2.invalidateWidget(widget_9);
               }

               Client.data.serverPacket = null;
               return true;
            }

            if (ServerPacketProt.updateZonePartialEnclosedMessage == Client.data.serverPacket) {
               UserComparator10.localSceneY = jagbuf.readInvertedUnsignedByte();
               class311.localSceneX = jagbuf.readNegatedUnsignedByte();

               while (jagbuf.position < Client.data.serverPacketLength) {
                  pos_node = jagbuf.readUnsignedByte();
                  RenderableSceneNode renderableSceneNode_59 = class6.method70()[pos_node];
                  SceneNode.addSceneNode(renderableSceneNode_59);
               }

               Client.data.serverPacket = null;
               return true;
            }

            Widget widget_20;
            if (ServerPacketProt.ifSetObjectMessage == Client.data.serverPacket) {
               pos_node = jagbuf.readIntMedEndian();
               i_6 = jagbuf.readUnsignedShort();
               if (i_6 == 65535) {
                  i_6 = -1;
               }

               i_18 = jagbuf.readIntCustomOrder();
               widget_20 = WorldMapElement.getWidget(pos_node);
               ItemDefinition itemDefinition_44;
               if (!widget_20.field2563) {
                  if (i_6 == -1) {
                     widget_20.field2607 = 0;
                     Client.data.serverPacket = null;
                     return true;
                  }

                  itemDefinition_44 = item.getDefinition(i_6);
                  widget_20.field2607 = 4;
                  widget_20.field2649 = i_6;
                  widget_20.field2615 = itemDefinition_44.xan2d;
                  widget_20.field2616 = itemDefinition_44.yan2d;
                  widget_20.field2618 = itemDefinition_44.zoom2d * 100 / i_18;
                  Widget2.invalidateWidget(widget_20);
               } else {
                  widget_20.field2690 = i_6;
                  widget_20.field2655 = i_18;
                  itemDefinition_44 = item.getDefinition(i_6);
                  widget_20.field2615 = itemDefinition_44.xan2d;
                  widget_20.field2616 = itemDefinition_44.yan2d;
                  widget_20.field2640 = itemDefinition_44.field3420;
                  widget_20.field2593 = itemDefinition_44.offsetX2d;
                  widget_20.field2614 = itemDefinition_44.offsetY2d;
                  widget_20.field2618 = itemDefinition_44.zoom2d;
                  if (itemDefinition_44.isStackable == 1) {
                     widget_20.field2703 = 1;
                  } else {
                     widget_20.field2703 = 2;
                  }

                  if (widget_20.field2619 > 0) {
                     widget_20.field2618 = widget_20.field2618 * 32 / widget_20.field2619;
                  } else if (widget_20.field2670 > 0) {
                     widget_20.field2618 = widget_20.field2618 * 32 / widget_20.field2670;
                  }

                  Widget2.invalidateWidget(widget_20);
               }

               Client.data.serverPacket = null;
               return true;
            }

            if (ServerPacketProt.synthSoundMessage == Client.data.serverPacket) {
               pos_node = jagbuf.readUnsignedShort();
               i_6 = jagbuf.readUnsignedByte();
               i_18 = jagbuf.readUnsignedShort();
               class81.method1989(pos_node, i_6, i_18);
               Client.data.serverPacket = null;
               return true;
            }

            if (ServerPacketProt.field2154 == Client.data.serverPacket) {
               pos_node = jagbuf.readUnsignedByte();
               i_6 = jagbuf.readUnsignedByte();
               i_18 = jagbuf.readUnsignedByte();
               i_8 = jagbuf.readUnsignedByte();
               field886[pos_node] = true;
               field901[pos_node] = i_6;
               field902[pos_node] = i_18;
               field903[pos_node] = i_8;
               field904[pos_node] = 0;
               Client.data.serverPacket = null;
               return true;
            }

            if (ServerPacketProt.rebuildRegionMessage == Client.data.serverPacket) {
               class55.method1084(true, Client.data.packetBuffer);
               Client.data.serverPacket = null;
               return true;
            }

            if (ServerPacketProt.field2194 == Client.data.serverPacket) {
               class61.method1120(jagbuf, Client.data.serverPacketLength);
               class75.method1827();
               Client.data.serverPacket = null;
               return true;
            }

            int i_10;
            int i_11;
            int i_21;
            if (ServerPacketProt.field2198 == Client.data.serverPacket) {
               field899 = true;
               class70.field1017 = jagbuf.readUnsignedByte();
               class30.field259 = jagbuf.readUnsignedByte();
               class31.field268 = jagbuf.readUnsignedShort();
               class56.field526 = jagbuf.readUnsignedByte();
               class55.field501 = jagbuf.readUnsignedByte();
               if (class55.field501 >= 100) {
                  pos_node = class70.field1017 * 128 + 64;
                  i_6 = class30.field259 * 128 + 64;
                  i_18 = MusicPatchPcmStream.getTileHeight(pos_node, i_6, WorldMapRectangle.plane) - class31.field268;
                  i_8 = pos_node - PacketBuffer.field3727;
                  i_21 = i_18 - GCMonitor.field383;
                  i_10 = i_6 - SceneNode.field3;
                  i_11 = (int)Math.sqrt((double)(i_10 * i_10 + i_8 * i_8));
                  class11.field77 = (int)(Math.atan2((double)i_21, (double)i_11) * 325.949D) & 0x7ff;
                  MouseRecorder.field1112 = (int) (Math.atan2((double) i_8, (double) i_10) * -325.949D) & 0x7ff;
                  if (class11.field77 < 128) {
                     class11.field77 = 128;
                  }

                  if (class11.field77 > 383) {
                     class11.field77 = 383;
                  }
               }

               Client.data.serverPacket = null;
               return true;
            }

            if (ServerPacketProt.logoutFullMessage == Client.data.serverPacket) {
               ParamDefinition.disconnectGame();
               Client.data.serverPacket = null;
               return false;
            }

            if (ServerPacketProt.worldHopAction == Client.data.serverPacket) {
               World world_41 = new World();
               world_41.host = jagbuf.readNullTerminatedString();
               world_41.id = jagbuf.readUnsignedShort();
               i_6 = jagbuf.readIntMedEndian();
               world_41.properties = i_6;
               class96.updateGameState(45);
               class305_3.close();
               class305_3 = null;
               class202.changeWorld(world_41);
               Client.data.serverPacket = null;
               return false;
            }

            if (ServerPacketProt.field2157 == Client.data.serverPacket) {
               System.out.println("Attempting to remove ground item node");
               SceneNode.addSceneNode(RenderableSceneNode.clearItem);
               Client.data.serverPacket = null;
               return true;
            }

            if (ServerPacketProt.field2164 == Client.data.serverPacket) {
               SceneNode.addSceneNode(RenderableSceneNode.field2324);
               Client.data.serverPacket = null;
               return true;
            }

            if (ServerPacketProt.MAYBE_HINT_ICON == Client.data.serverPacket) {
               pos_node = jagbuf.readIntCustomOrder();
               i_6 = jagbuf.readShortWithOffset2();
               widget_7 = WorldMapElement.getWidget(pos_node);
               if (widget_7 != null && widget_7.field2566 == 0) {
                  if (i_6 > widget_7.field2569 - widget_7.field2667) {
                     i_6 = widget_7.field2569 - widget_7.field2667;
                  }

                  if (i_6 < 0) {
                     i_6 = 0;
                  }

                  if (i_6 != widget_7.field2586) {
                     widget_7.field2586 = i_6;
                     Widget2.invalidateWidget(widget_7);
                  }
               }

               Client.data.serverPacket = null;
               return true;
            }

            long long_22;
            if (ServerPacketProt.ifSetClanMessage == Client.data.serverPacket) {
               pos_node = jagbuf.readIntLittleEndian();
               i_6 = jagbuf.readShortWithOffset();
               if (i_6 == 65535) {
                  i_6 = -1;
               }

               i_18 = jagbuf.readIntCustomOrder();
               i_8 = jagbuf.readUnsignedShort();
               if (i_8 == 65535) {
                  i_8 = -1;
               }

               for (i_21 = i_8; i_21 <= i_6; i_21++) {
                  long_22 = (long)i_21 + ((long)i_18 << 32);
                  LinkedListNode linkedListNode_47 = field857.method5952(long_22);
                  if (linkedListNode_47 != null) {
                     linkedListNode_47.unlink();
                  }

                  field857.method5951(new class179(pos_node), long_22);
               }

               Client.data.serverPacket = null;
               return true;
            }

            Widget widget_54;
            if (ServerPacketProt.field2122 == Client.data.serverPacket) {
               pos_node = jagbuf.readIntCustomOrder2();
               widget_54 = WorldMapElement.getWidget(pos_node);

               for (i_18 = 0; i_18 < widget_54.field2560.length; i_18++) {
                  widget_54.field2560[i_18] = -1;
                  widget_54.field2560[i_18] = 0;
               }

               Widget2.invalidateWidget(widget_54);
               Client.data.serverPacket = null;
               return true;
            }

            if (ServerPacketProt.field2165 == Client.data.serverPacket) {
               pos_node = jagbuf.readIntMedEndian();
               if (pos_node != field855) {
                  field855 = pos_node;
                  class69.method1670((byte) -105);
               }

               Client.data.serverPacket = null;
               return true;
            }

            class61 class61_53;
            if (ServerPacketProt.ifOpenSubMessage == Client.data.serverPacket) {
               pos_node = jagbuf.readOffsetUnsignedByte();
               i_6 = jagbuf.readIntCustomOrder2();
               i_18 = jagbuf.readShortWithOffset2();
               class61_53 = (class61) field816.method5952((long)i_6);
               if (class61_53 != null) {
                  class197.method3697(class61_53, i_18 != class61_53.field571);
               }

               class68.method1652(i_6, i_18, pos_node);
               Client.data.serverPacket = null;
               return true;
            }

            if (ServerPacketProt.field2183 == Client.data.serverPacket) {
               class226.field3072 = class171.method3530(jagbuf.readUnsignedByte());
               Client.data.serverPacket = null;
               return true;
            }

            if (ServerPacketProt.midiSongMessage == Client.data.serverPacket) {
               pos_node = jagbuf.readShortWithOffset2();
               if (pos_node == 65535) {
                  pos_node = -1;
               }

               class8.method93(pos_node);
               Client.data.serverPacket = null;
               return true;
            }

            if (ServerPacketProt.field2155 == Client.data.serverPacket) {
               pos_node = jagbuf.read24BitIntLittleEndian();
               i_6 = jagbuf.readShortWithOffset();
               if (i_6 == 65535) {
                  i_6 = -1;
               }

               class17.method188(i_6);
               Client.data.serverPacket = null;
               return true;
            }

            if (ServerPacketProt.updateFriendsMessage == Client.data.serverPacket) {
               pos_node = jagbuf.readSignedShortBigEndian();
               i_6 = jagbuf.readIntCustomOrder();
               widget_7 = WorldMapElement.getWidget(i_6);
               if (pos_node != widget_7.field2611 || pos_node == -1) {
                  widget_7.field2611 = pos_node;
                  widget_7.field2692 = 0;
                  widget_7.field2584 = 0;
                  Widget2.invalidateWidget(widget_7);
               }

               Client.data.serverPacket = null;
               return true;
            }

            if (ServerPacketProt.field2147 == Client.data.serverPacket) {
               class58.field546.field1071.method5075(jagbuf, Client.data.serverPacketLength, -726342746);
               class2.method28();
               field672 = field673;
               Client.data.serverPacket = null;
               return true;
            }

            if (ServerPacketProt.field2196 == Client.data.serverPacket) {
               class56.method1087(true, jagbuf);
               Client.data.serverPacket = null;
               return true;
            }

            long long_13;
            long long_24;
            long long_26;
            String string_38;
            if (ServerPacketProt.field2142 == Client.data.serverPacket) {
               string_38 = jagbuf.readNullTerminatedString();
               long_24 = jagbuf.readLongFromMediumEndian();
               long_26 = (long) jagbuf.readUnsignedShort();
               long_22 = (long) jagbuf.read24BitInt();
               GameState gameState_12 = (GameState) MemoryManager.findById(PriorityComparator.getGameStates(), jagbuf.readUnsignedByte());
               long_13 = (long_26 << 32) + long_22;
               boolean bool_50 = false;

               for (int i_16 = 0; i_16 < 100; i_16++) {
                  if (field922[i_16] == long_13) {
                     bool_50 = true;
                     break;
                  }
               }

               if (gameState_12.field3092 && class58.field546.isIgnored(new Username(string_38, FontName.loginType))) {
                  bool_50 = true;
               }

               if (!bool_50 && field767 == 0) {
                  field922[field875] = long_13;
                  field875 = (field875 + 1) % 100;
                  String string_28 = AbstractFont.escapeBrackets(SceneNode.method17(class311.method5898(jagbuf, (byte) 39)));
                  if (gameState_12.modIcon != -1) {
                     MilliClock.method157(9, AbstractWorldMapData.iconTag(gameState_12.modIcon) + string_38, string_28, SoundSystem.base37DecodeLong(long_24));
                  } else {
                     MilliClock.method157(9, string_38, string_28, SoundSystem.base37DecodeLong(long_24));
                  }
               }

               Client.data.serverPacket = null;
               return true;
            }

            if (ServerPacketProt.runClientScriptMessage == Client.data.serverPacket) {
               string_38 = jagbuf.readNullTerminatedString();
               Object[] arr_58 = new Object[string_38.length() + 1];

               for (i_18 = string_38.length() - 1; i_18 >= 0; --i_18) {
                  if (string_38.charAt(i_18) == 115) {
                     arr_58[i_18 + 1] = jagbuf.readNullTerminatedString();
                  } else {
                     arr_58[i_18 + 1] = new Integer(jagbuf.readIntMedEndian());
                  }
               }

               arr_58[0] = new Integer(jagbuf.readIntMedEndian());
               MusicPatchPcmStream musicPatchPcmStream_49 = new MusicPatchPcmStream();
               musicPatchPcmStream_49.field581 = arr_58;
               class184.method3613(musicPatchPcmStream_49);
               Client.data.serverPacket = null;
               return true;
            }

            String str_45;
            if (ServerPacketProt.field2133 == Client.data.serverPacket) {
               byte[] bytes_40 = new byte[Client.data.serverPacketLength];
               jagbuf.method5443(bytes_40, 0, bytes_40.length);
               ByteBuffer class300_56 = new ByteBuffer(bytes_40);
               str_45 = class300_56.readNullTerminatedString();
               class5.method50(str_45, true, false);
               Client.data.serverPacket = null;
               return true;
            }

            if (ServerPacketProt.field2162 == Client.data.serverPacket) {
               if (Client.data.serverPacketLength == 0) {
                  class46.field410 = null;
               } else {
                  if (class46.field410 == null) {
                     class46.field410 = new class285(FontName.loginType, WorldMapID.client);
                  }

                  class46.field410.method5233(jagbuf, -1982298123);
               }

               class267.method4986(1804556356);
               Client.data.serverPacket = null;
               return true;
            }

            if (ServerPacketProt.field2143 == Client.data.serverPacket) {
               for (pos_node = 0; pos_node < field909.length; pos_node++) {
                  if (field909[pos_node] != null) {
                     field909[pos_node].field981 = -1;
                  }
               }

               for (pos_node = 0; pos_node < npcs.length; pos_node++) {
                  if (npcs[pos_node] != null) {
                     npcs[pos_node].field981 = -1;
                  }
               }

               Client.data.serverPacket = null;
               return true;
            }

            if (ServerPacketProt.updatePrivateMessage == Client.data.serverPacket) {
               if (class46.field410 != null) {
                  class46.field410.method5234(jagbuf, -891757405);
               }

               class267.method4986(1804556356);
               Client.data.serverPacket = null;
               return true;
            }

            if (ServerPacketProt.field2121 == Client.data.serverPacket) {
               field899 = true;
               class46.field412 = jagbuf.readUnsignedByte();
               class210.field2516 = jagbuf.readUnsignedByte();
               class190.field2345 = jagbuf.readUnsignedShort();
               class83.field1166 = jagbuf.readUnsignedByte();
               class96.field1327 = jagbuf.readUnsignedByte();
               if (class96.field1327 >= 100) {
                  PacketBuffer.field3727 = class46.field412 * 128 + 64;
                  SceneNode.field3 = class210.field2516 * 128 + 64;
                  GCMonitor.field383 = MusicPatchPcmStream.getTileHeight(PacketBuffer.field3727, SceneNode.field3, WorldMapRectangle.plane) - class190.field2345;
               }

               Client.data.serverPacket = null;
               return true;
            }

            if (ServerPacketProt.field2117 == Client.data.serverPacket) {
               field899 = false;

               for (pos_node = 0; pos_node < 5; pos_node++) {
                  field886[pos_node] = false;
               }

               Client.data.serverPacket = null;
               return true;
            }

            if (ServerPacketProt.soundAreaMessage == Client.data.serverPacket) {
               SceneNode.addSceneNode(RenderableSceneNode.field2319);
               Client.data.serverPacket = null;
               return true;
            }

            if (ServerPacketProt.field2144 == Client.data.serverPacket) {
               class58.field546.method1760();
               field672 = field673;
               Client.data.serverPacket = null;
               return true;
            }

            if (ServerPacketProt.updateStatMessage == Client.data.serverPacket) {
               class65.method1176();
               pos_node = jagbuf.readIntLittleEndian();
               i_6 = jagbuf.readNegatedUnsignedByte();
               i_18 = jagbuf.readUnsignedByte();
               field788[i_6] = pos_node;
               field760[i_6] = i_18;
               field787[i_6] = 1;

               for (i_8 = 0; i_8 < 98; i_8++) {
                  if (pos_node >= class221.field2743[i_8]) {
                     field787[i_6] = i_8 + 2;
                  }
               }

               field845[++field846 - 1 & 0x1f] = i_6;
               Client.data.serverPacket = null;
               return true;
            }

            if (ServerPacketProt.mapAnimMessage == Client.data.serverPacket) {
               System.out.println("mapAnimMessage message packet");

               SceneNode.addSceneNode(RenderableSceneNode.field2317);
               Client.data.serverPacket = null;
               return true;
            }

            if (ServerPacketProt.objDelMessage == Client.data.serverPacket) {
               System.out.println("objDelMessage message packet");

               SceneNode.addSceneNode(RenderableSceneNode.field2321);
               Client.data.serverPacket = null;
               return true;
            }

            if (ServerPacketProt.objCountMessage == Client.data.serverPacket) {
               System.out.println("object count message packet");
               SceneNode.addSceneNode(RenderableSceneNode.field2322);
               Client.data.serverPacket = null;
               return true;
            }

            if (ServerPacketProt.setOpPlayerMessage == Client.data.serverPacket) {
               pos_node = jagbuf.readOffsetUnsignedByte();
               i_6 = jagbuf.readOffsetUnsignedByte();
               str_45 = jagbuf.readNullTerminatedString();
               if (i_6 >= 1 && i_6 <= 8) {
                  if (str_45.equalsIgnoreCase("null")) {
                     str_45 = null;
                  }

                  field778[i_6 - 1] = str_45;
                  field779[i_6 - 1] = pos_node == 0;
               }

               Client.data.serverPacket = null;
               return true;
            }

            if (ServerPacketProt.ifCloseSub == Client.data.serverPacket) {
               pos_node = jagbuf.readIntMedEndian();
               class61 class61_55 = (class61) field816.method5952((long) pos_node);
               if (class61_55 != null) {
                  class197.method3697(class61_55, true);
               }

               if (field850 != null) {
                  Widget2.invalidateWidget(field850);
                  field850 = null;
               }

               Client.data.serverPacket = null;
               return true;
            }

            if (ServerPacketProt.field2170 == Client.data.serverPacket) {
               pos_node = jagbuf.readUnsignedByte();
               if (jagbuf.readUnsignedByte() == 0) {
                  field866[pos_node] = new class9();
                  jagbuf.position += 18;
               } else {
                  --jagbuf.position;
                  field866[pos_node] = new class9(jagbuf, false);
               }

               field915 = field673;
               Client.data.serverPacket = null;
               return true;
            }

            if (ServerPacketProt.field2188 == Client.data.serverPacket) {
               for (pos_node = 0; pos_node < class212.var_configurations.length; pos_node++) {
                  if (class212.field2524[pos_node] != class212.var_configurations[pos_node]) {
                     class212.var_configurations[pos_node] = class212.field2524[pos_node];
                     class10.method124(pos_node);
                     field863[++field806 - 1 & 0x1f] = pos_node;
                  }
               }

               Client.data.serverPacket = null;
               return true;
            }

            if (ServerPacketProt.ifSetNpcHeadMessage == Client.data.serverPacket) {
               pos_node = jagbuf.readShortWithOffset2();
               i_6 = jagbuf.readIntCustomOrder();
               widget_7 = WorldMapElement.getWidget(i_6);
               if (widget_7.field2607 != 2 || pos_node != widget_7.field2649) {
                  widget_7.field2607 = 2;
                  widget_7.field2649 = pos_node;
                  Widget2.invalidateWidget(widget_7);
               }

               Client.data.serverPacket = null;
               return true;
            }

            if (ServerPacketProt.updateIgnoresMessage == Client.data.serverPacket) {
               pos_node = jagbuf.readIntCustomOrder2();
               i_6 = jagbuf.readSignedShortWithOffset();
               i_18 = jagbuf.readSignedShortLittleEndian();
               widget_20 = WorldMapElement.getWidget(pos_node);
               if (i_18 != widget_20.field2651 || i_6 != widget_20.field2574 || widget_20.field2694 != 0 || widget_20.field2570 != 0) {
                  widget_20.field2651 = i_18;
                  widget_20.field2574 = i_6;
                  widget_20.field2694 = 0;
                  widget_20.field2570 = 0;
                  Widget2.invalidateWidget(widget_20);
                  this.method1260(widget_20);
                  if (widget_20.field2566 == 0) {
                     WorldMapID.method413(Widget.field2556[pos_node >> 16], widget_20, false);
                  }
               }

               Client.data.serverPacket = null;
               return true;
            }

            if (ServerPacketProt.field2160 == Client.data.serverPacket) {
               class55.method1084(false, Client.data.packetBuffer);
               Client.data.serverPacket = null;
               return true;
            }

            if (ServerPacketProt.messageGameMessage == Client.data.serverPacket) {
               //..Decode
               pos_node = jagbuf.readSmartInt();
               packet_boolean_234 = jagbuf.readUnsignedByte() == 1;
               str_45 = "";
               boolean bool_46 = false;
               if (packet_boolean_234) {
                  str_45 = jagbuf.readNullTerminatedString();
                  if (class58.field546.isIgnored(new Username(str_45, FontName.loginType))) {
                     bool_46 = true;
                  }
               }

               String string_43 = jagbuf.readNullTerminatedString();
               if (packetDebugging) {
                  System.out.println("======= messageGameMessage =======");
                  System.out.println("i_17 : " + pos_node);
                  System.out.println("bool_48 : " + packet_boolean_234);
                  System.out.println("Client Game Message : " + string_43);
                  System.out.println("======= end_messageGameMessage =======");
               }
               if (!bool_46) {
                  MusicPatchPcmStream.method1132(pos_node, str_45, string_43);
               }

               Client.data.serverPacket = null;
               return true;
            }

            if (ServerPacketProt.varpLargeMessage == Client.data.serverPacket) {
               pos_node = jagbuf.readUnsignedShort();
               i_6 = jagbuf.readIntMedEndian();
               class212.field2524[pos_node] = i_6;
               if (class212.var_configurations[pos_node] != i_6) {
                  class212.var_configurations[pos_node] = i_6;
               }

               class10.method124(pos_node);
               field863[++field806 - 1 & 0x1f] = pos_node;
               Client.data.serverPacket = null;
               return true;
            }

            if (ServerPacketProt.field2140 == Client.data.serverPacket) {
               UserComparator10.localSceneY = jagbuf.readNegatedUnsignedByte();
               class311.localSceneX = jagbuf.readUnsignedByte();

               for (pos_node = class311.localSceneX; pos_node < class311.localSceneX + 8; pos_node++) {
                  for (i_6 = UserComparator10.localSceneY; i_6 < UserComparator10.localSceneY + 8; i_6++) {
                     if (groundItems[WorldMapRectangle.plane][pos_node][i_6] != null) {
                        groundItems[WorldMapRectangle.plane][pos_node][i_6] = null;
                        class5.updatePendingSpawn(pos_node, i_6);
                     }
                  }
               }

               for (class68 class68_39 = (class68) field783.method4892(); class68_39 != null; class68_39 = (class68) field783.method4894()) {
                  if (class68_39.field937 >= class311.localSceneX && class68_39.field937 < class311.localSceneX + 8 && class68_39.field934 >= UserComparator10.localSceneY && class68_39.field934 < UserComparator10.localSceneY + 8 && class68_39.field943 == WorldMapRectangle.plane) {
                     class68_39.field931 = 0;
                  }
               }

               Client.data.serverPacket = null;
               return true;
            }

            if (ServerPacketProt.field2184 == Client.data.serverPacket) {
               pos_node = jagbuf.readIntMedEndian();
               i_6 = jagbuf.readIntMedEndian();
               i_18 = MemoryManager.getGCPercentage();
               class187 class187_57 = class235.method4265(ClientPacketProt.field2236, data.field1313);
               class187_57.outBuffer.writeNegatedByte(i_18);
               class187_57.outBuffer.writeByte(GameApplet.field462);
               class187_57.outBuffer.writeIntReversed(pos_node);
               class187_57.outBuffer.writeIntLittleEndian(i_6);
               data.copy(class187_57);
               Client.data.serverPacket = null;
               return true;
            }

            if (ServerPacketProt.ifOpenTopMessage == Client.data.serverPacket) {
               pos_node = jagbuf.readShortWithOffset2();
               field905 = pos_node;
               this.method1293(false);
               HealthBarUpdate.method146(pos_node);
               class48.method813(field905);

               for (i_6 = 0; i_6 < 100; i_6++) {
                  field843[i_6] = true;
               }

               Client.data.serverPacket = null;
               return true;
            }

            if (ServerPacketProt.ifSetPlayerHeadMessage == Client.data.serverPacket) {
               pos_node = jagbuf.readIntCustomOrder();
               widget_54 = WorldMapElement.getWidget(pos_node);
               widget_54.field2607 = 3;
               widget_54.field2649 = localPlayer.field613.method3994();
               Widget2.invalidateWidget(widget_54);
               Client.data.serverPacket = null;
               return true;
            }

            if (ServerPacketProt.field2180 == Client.data.serverPacket) {
               string_38 = jagbuf.readNullTerminatedString();
               string_19 = AbstractFont.escapeBrackets(SceneNode.method17(class311.method5898(jagbuf, (byte) 54)));
               MusicPatchPcmStream.method1132(6, string_38, string_19);
               Client.data.serverPacket = null;
               return true;
            }

            if (ServerPacketProt.field2153 == Client.data.serverPacket) {
               UserComparator10.method2213(jagbuf);
               Client.data.serverPacket = null;
               return true;
            }

            if (ServerPacketProt.field2151 == Client.data.serverPacket) {
               field708 = jagbuf.readUnsignedByte();
               if (field708 == 1) {
                  field824 = jagbuf.readUnsignedShort();
               }

               if (field708 >= 2 && field708 <= 6) {
                  if (field708 == 2) {
                     field821 = 64;
                     field677 = 64;
                  }

                  if (field708 == 3) {
                     field821 = 0;
                     field677 = 64;
                  }

                  if (field708 == 4) {
                     field821 = 128;
                     field677 = 64;
                  }

                  if (field708 == 5) {
                     field821 = 64;
                     field677 = 0;
                  }

                  if (field708 == 6) {
                     field821 = 64;
                     field677 = 128;
                  }

                  field708 = 2;
                  field737 = jagbuf.readUnsignedShort();
                  field777 = jagbuf.readUnsignedShort();
                  field675 = jagbuf.readUnsignedByte();
               }

               if (field708 == 10) {
                  field689 = jagbuf.readUnsignedShort();
               }

               Client.data.serverPacket = null;
               return true;
            }

            if (ServerPacketProt.locAddChangeMessage == Client.data.serverPacket) {
               System.out.println("locAddChangeMessage message packet");

               SceneNode.addSceneNode(RenderableSceneNode.field2323);
               Client.data.serverPacket = null;
               return true;
            }

            if (ServerPacketProt.updateClanFriendsMaybe == Client.data.serverPacket) {
               for (pos_node = 0; pos_node < ClanEntry.size; pos_node++) {
                  ClanEntry clan_player = class5.method61(pos_node);
                  if (clan_player != null) {
                     class212.field2524[pos_node] = 0;
                     class212.var_configurations[pos_node] = 0;
                  }
               }

               class65.method1176();
               field806 += 32;
               Client.data.serverPacket = null;
               return true;
            }

            if (ServerPacketProt.field2171 == Client.data.serverPacket) {
               pos_node = jagbuf.position + Client.data.serverPacketLength;
               i_6 = jagbuf.readUnsignedShort();
               i_18 = jagbuf.readUnsignedShort();
               if (i_6 != field905) {
                  field905 = i_6;
                  this.method1293(false);
                  HealthBarUpdate.method146(field905);
                  class48.method813(field905);

                  for (i_8 = 0; i_8 < 100; i_8++) {
                     field843[i_8] = true;
                  }
               }

               class61 class61_60;
               for (; i_18-- > 0; class61_60.field567 = true) {
                  i_8 = jagbuf.readIntMedEndian();
                  i_21 = jagbuf.readUnsignedShort();
                  i_10 = jagbuf.readUnsignedByte();
                  class61_60 = (class61) field816.method5952((long)i_8);
                  if (class61_60 != null && i_21 != class61_60.field571) {
                     class197.method3697(class61_60, true);
                     class61_60 = null;
                  }

                  if (class61_60 == null) {
                     class61_60 = class68.method1652(i_8, i_21, i_10);
                  }
               }

               for (class61_53 = (class61) field816.method5950(); class61_53 != null; class61_53 = (class61) field816.method5953()) {
                  if (class61_53.field567) {
                     class61_53.field567 = false;
                  } else {
                     class197.method3697(class61_53, true);
                  }
               }

               field857 = new class318(512);

               while (jagbuf.position < pos_node) {
                  i_8 = jagbuf.readIntMedEndian();
                  i_21 = jagbuf.readUnsignedShort();
                  i_10 = jagbuf.readUnsignedShort();
                  i_11 = jagbuf.readIntMedEndian();

                  for (int i_30 = i_21; i_30 <= i_10; i_30++) {
                     long_13 = ((long)i_8 << 32) + (long)i_30;
                     field857.method5951(new class179(i_11), long_13);
                  }
               }

               Client.data.serverPacket = null;
               return true;
            }

            if (ServerPacketProt.updateInvFullMessage == Client.data.serverPacket) {
               pos_node = jagbuf.readIntMedEndian();
               i_6 = jagbuf.readUnsignedShort();
               if (pos_node < -70000) {
                  i_6 += 32768;
               }

               if (pos_node >= 0) {
                  widget_7 = WorldMapElement.getWidget(pos_node);
               } else {
                  widget_7 = null;
               }

               if (widget_7 != null) {
                  for (i_8 = 0; i_8 < widget_7.field2560.length; i_8++) {
                     widget_7.field2560[i_8] = 0;
                     widget_7.field2705[i_8] = 0;
                  }
               }

               HealthBarUpdate.method144(i_6);
               i_8 = jagbuf.readUnsignedShort();

               for (i_21 = 0; i_21 < i_8; i_21++) {
                  i_10 = jagbuf.readUnsignedShort();
                  i_11 = jagbuf.readUnsignedByte();
                  if (i_11 == 255) {
                     i_11 = jagbuf.readIntCustomOrder();
                  }

                  if (widget_7 != null && i_21 < widget_7.field2560.length) {
                     widget_7.field2560[i_21] = i_10;
                     widget_7.field2705[i_21] = i_11;
                  }

                  HealthBarUpdate.method134(i_6, i_21, i_10 - 1, i_11);
               }

               if (widget_7 != null) {
                  Widget2.invalidateWidget(widget_7);
               }

               class65.method1176();
               field888[++field671 - 1 & 0x1f] = i_6 & 0x7fff;
               Client.data.serverPacket = null;
               return true;
            }

            if (ServerPacketProt.setMapFlagMessage == Client.data.serverPacket) {
               destinationX = jagbuf.readUnsignedByte();
               if (destinationX == 255) {
                  destinationX = 0;
               }

               destinationY = jagbuf.readUnsignedByte();
               if (destinationY == 255) {
                  destinationY = 0;
               }

               Client.data.serverPacket = null;
               return true;
            }

            if (ServerPacketProt.updateRunWeightMessage == Client.data.serverPacket) {
               class65.method1176();
               field823 = jagbuf.readSignedShortBigEndian();
               field844 = field673;
               Client.data.serverPacket = null;
               return true;
            }

            if (ServerPacketProt.field2195 == Client.data.serverPacket) {
               field872 = jagbuf.readNegatedUnsignedByte();
               field907 = jagbuf.readNegatedUnsignedByte();
               Client.data.serverPacket = null;
               return true;
            }

            if (ServerPacketProt.ifSetTextMessage == Client.data.serverPacket) {
               pos_node = jagbuf.readIntMedEndian();
               string_19 = jagbuf.readNullTerminatedString();
               widget_7 = WorldMapElement.getWidget(pos_node);
               if (!string_19.equals(widget_7.field2601)) {
                  widget_7.field2601 = string_19;
                  Widget2.invalidateWidget(widget_7);
               }

               Client.data.serverPacket = null;
               return true;
            }

            if (ServerPacketProt.triggerOnDialogAbortMessage == Client.data.serverPacket) {
               if (field905 != -1) {
                  class17.method175(field905, 0);
               }

               Client.data.serverPacket = null;
               return true;
            }

            boolean bool_51;
            if (ServerPacketProt.field2131 == Client.data.serverPacket) {
               bool_51 = jagbuf.readBoolean();
               if (bool_51) {
                  if (class68.field944 == null) {
                     class68.field944 = new class237();
                  }
               } else {
                  class68.field944 = null;
               }

               Client.data.serverPacket = null;
               return true;
            }

            if (ServerPacketProt.field2135 == Client.data.serverPacket) {
               bool_51 = jagbuf.readUnsignedByte() == 1;
               if (bool_51) {
                  Categorizable.field3632 = TimeUtils.getAdjustedTimeMillis() - jagbuf.readLongFromMediumEndian();
                  class68.field942 = new class6(jagbuf);
               } else {
                  class68.field942 = null;
               }

               field851 = field673;
               Client.data.serverPacket = null;
               return true;
            }

            if (ServerPacketProt.field2139 == Client.data.serverPacket) {
               pos_node = jagbuf.readIntCustomOrder2();
               i_6 = jagbuf.readShortWithOffset();
               i_18 = i_6 >> 10 & 0x1f;
               i_8 = i_6 >> 5 & 0x1f;
               i_21 = i_6 & 0x1f;
               i_10 = (i_8 << 11) + (i_18 << 19) + (i_21 << 3);
               Widget widget_29 = WorldMapElement.getWidget(pos_node);
               if (i_10 != widget_29.field2695) {
                  widget_29.field2695 = i_10;
                  Widget2.invalidateWidget(widget_29);
               }

               Client.data.serverPacket = null;
               return true;
            }

            if (ServerPacketProt.field2172 == Client.data.serverPacket) {
               jagbuf.position += 28;
               if (jagbuf.verifyCRC32()) {
                  WorldMapID.method407(jagbuf, jagbuf.position - 28, 291436994);
               }

               Client.data.serverPacket = null;
               return true;
            }

            if (ServerPacketProt.mapProjAnimMessage == Client.data.serverPacket) {
               System.out.println("Incoming scene projectile node call.");
               SceneNode.addSceneNode(RenderableSceneNode.projectileNode);
               Client.data.serverPacket = null;
               return true;
            }

            if (ServerPacketProt.ifMoveSubMessage == Client.data.serverPacket) {
               pos_node = jagbuf.readIntMedEndian();
               i_6 = jagbuf.readIntMedEndian();
               class61 class61_42 = (class61) field816.method5952((long)i_6);
               class61_53 = (class61) field816.method5952((long) pos_node);
               if (class61_53 != null) {
                  class197.method3697(class61_53, class61_42 == null || class61_42.field571 != class61_53.field571);
               }

               if (class61_42 != null) {
                  class61_42.unlink();
                  field816.method5951(class61_42, (long) pos_node);
               }

               widget_9 = WorldMapElement.getWidget(i_6);
               if (widget_9 != null) {
                  Widget2.invalidateWidget(widget_9);
               }

               widget_9 = WorldMapElement.getWidget(pos_node);
               if (widget_9 != null) {
                  Widget2.invalidateWidget(widget_9);
                  WorldMapID.method413(Widget.field2556[widget_9.field2688 >>> 16], widget_9, true);
               }

               if (field905 != -1) {
                  class17.method175(field905, 1);
               }

               Client.data.serverPacket = null;
               return true;
            }

            if (ServerPacketProt.field2141 == Client.data.serverPacket) {
               string_38 = jagbuf.readNullTerminatedString();
               long_24 = (long) jagbuf.readUnsignedShort();
               long_26 = (long) jagbuf.read24BitInt();
               GameState gameState_31 = (GameState) MemoryManager.findById(PriorityComparator.getGameStates(), jagbuf.readUnsignedByte());
               long long_32 = (long_24 << 32) + long_26;
               boolean bool_34 = false;

               for (int i_14 = 0; i_14 < 100; i_14++) {
                  if (long_32 == field922[i_14]) {
                     bool_34 = true;
                     break;
                  }
               }

               if (class58.field546.isIgnored(new Username(string_38, FontName.loginType))) {
                  bool_34 = true;
               }

               if (!bool_34 && field767 == 0) {
                  field922[field875] = long_32;
                  field875 = (field875 + 1) % 100;
                  String string_35 = AbstractFont.escapeBrackets(SceneNode.method17(class311.method5898(jagbuf, (byte) 52)));
                  byte b_15;
                  if (gameState_31.field3091) {
                     b_15 = 7;
                  } else {
                     b_15 = 3;
                  }

                  if (gameState_31.modIcon != -1) {
                     MusicPatchPcmStream.method1132(b_15, AbstractWorldMapData.iconTag(gameState_31.modIcon) + string_38, string_35);
                  } else {
                     MusicPatchPcmStream.method1132(b_15, string_38, string_35);
                  }
               }

               Client.data.serverPacket = null;
               return true;
            }

            if (ServerPacketProt.field2148 == Client.data.serverPacket) {
               class56.method1087(false, jagbuf);
               Client.data.serverPacket = null;
               return true;
            }

            if (ServerPacketProt.field2156 == Client.data.serverPacket) {
               pos_node = jagbuf.readShortWithOffset();
               i_6 = jagbuf.readShortLittleEndian();
               i_18 = jagbuf.readIntCustomOrder2();
               widget_20 = WorldMapElement.getWidget(i_18);
               widget_20.field2575 = pos_node + (i_6 << 16);
               Client.data.serverPacket = null;
               return true;
            }

            if (ServerPacketProt.field2132 == Client.data.serverPacket) {
               class58.field546.method1805(jagbuf, Client.data.serverPacketLength, 499123399);
               field672 = field673;
               Client.data.serverPacket = null;
               return true;
            }

            if (ServerPacketProt.field2175 == Client.data.serverPacket) {
               pos_node = jagbuf.readIntCustomOrder();
               i_6 = jagbuf.readShortWithOffset2();
               widget_7 = WorldMapElement.getWidget(pos_node);
               if (widget_7.field2607 != 1 || i_6 != widget_7.field2649) {
                  widget_7.field2607 = 1;
                  widget_7.field2649 = i_6;
                  Widget2.invalidateWidget(widget_7);
               }

               Client.data.serverPacket = null;
               return true;
            }

            if (ServerPacketProt.updateInvPartialMessage == Client.data.serverPacket) {
               pos_node = jagbuf.readIntMedEndian();
               i_6 = jagbuf.readUnsignedShort();
               if (pos_node < -70000) {
                  i_6 += 32768;
               }

               if (pos_node >= 0) {
                  widget_7 = WorldMapElement.getWidget(pos_node);
               } else {
                  widget_7 = null;
               }

               for (; jagbuf.position < Client.data.serverPacketLength; HealthBarUpdate.method134(i_6, i_8, i_21 - 1, i_10)) {
                  i_8 = jagbuf.readSmartInt();
                  i_21 = jagbuf.readUnsignedShort();
                  i_10 = 0;
                  if (i_21 != 0) {
                     i_10 = jagbuf.readUnsignedByte();
                     if (i_10 == 255) {
                        i_10 = jagbuf.readIntMedEndian();
                     }
                  }

                  if (widget_7 != null && i_8 >= 0 && i_8 < widget_7.field2560.length) {
                     widget_7.field2560[i_8] = i_21;
                     widget_7.field2705[i_8] = i_10;
                  }
               }

               if (widget_7 != null) {
                  Widget2.invalidateWidget(widget_7);
               }

               class65.method1176();
               field888[++field671 - 1 & 0x1f] = i_6 & 0x7fff;
               Client.data.serverPacket = null;
               return true;
            }

            if (ServerPacketProt.setNewCookieTokenSomething == Client.data.serverPacket) {
               MilliClock.generateDocument(jagbuf.readNullTerminatedString());
               Client.data.serverPacket = null;
               return true;
            }

            if (ServerPacketProt.updateRunEnergyMessage == Client.data.serverPacket) {
               class65.method1176();
               field910 = jagbuf.readUnsignedByte();
               field844 = field673;
               Client.data.serverPacket = null;
               return true;
            }

            ErrorHandler.logError((Client.data.serverPacket != null ? Client.data.serverPacket.field2201 : -1) + "," + (Client.data.field1321 != null ? Client.data.field1321.field2201 : -1) + "," + (Client.data.field1317 != null ? Client.data.field1317.field2201 : -1) + "," + Client.data.serverPacketLength, null);
            ParamDefinition.disconnectGame();
         } catch (IOException ioexception_36) {
            class56.method1090();
         } catch (Exception exception_37) {
            string_19 = "" + (Client.data.serverPacket != null ? Client.data.serverPacket.field2201 : -1) + "," + (Client.data.field1321 != null ? Client.data.field1321.field2201 : -1) + "," + (Client.data.field1317 != null ? Client.data.field1317.field2201 : -1) + "," + Client.data.serverPacketLength + "," + (localPlayer.field994[0] + class196.field2389) + "," + (localPlayer.field962[0] + SceneNode.field1) + ",";

            for (i_18 = 0; i_18 < Client.data.serverPacketLength && i_18 < 50; i_18++) {
               string_19 = string_19 + jagbuf.buffer[i_18] + ",";
            }

            ErrorHandler.logError(string_19, exception_37);
            ParamDefinition.disconnectGame();
         }

         return true;
      }
   }

   final void method1274(int i_1, int i_2) {
      class236.method4312(i_1, i_2);
      class5.scene.click(WorldMapRectangle.plane, i_1, i_2, false);
      field674 = true;
   }

   final void method1254() {
      if (field905 != -1) {
         class235.method4269(field905);
      }

      int i_2;
      for (i_2 = 0; i_2 < field858; i_2++) {
         if (field843[i_2]) {
            field861[i_2] = true;
         }

         field862[i_2] = field843[i_2];
         field843[i_2] = false;
      }

      field741 = cycle;
      field803 = -1;
      field804 = -1;
      class294.field3697 = null;
      if (field905 != -1) {
         field858 = 0;
         class191.method3668(field905, 0, 0, class7.clientWidth, ParamComposition.clientHeight, 0, 0, -1);
      }

      Rasterizer2D.method5996();
      if (field758) {
         if (field757 == 1) {
            SceneOccluder.field1915[field756 / 100].drawTransBgAt(field876 - 8, field755 - 8);
         }

         if (field757 == 2) {
            SceneOccluder.field1915[field756 / 100 + 4].drawTransBgAt(field876 - 8, field755 - 8);
         }
      }

      int i_3;
      int i_4;
      int i_5;
      int i_7;
      int i_8;
      int i_14;
      if (!field674) {
         if (field803 != -1) {
            WorldMapID.method412(field803, field804);
         }
      } else {
         i_2 = class247.field3292;
         i_3 = class30.field267;
         i_4 = WorldMapRectangle.field373;
         i_5 = class75.field1092;
         int i_15 = 6116423;
         Rasterizer2D.fillRectangle(i_2, i_3, i_4, i_5, i_15);
         Rasterizer2D.fillRectangle(i_2 + 1, i_3 + 1, i_4 - 2, 16, 0);
         Rasterizer2D.drawRectangle(i_2 + 1, i_3 + 18, i_4 - 2, i_5 - 19, 0);
         class23.fontBold12.draw("Choose Option", i_2 + 3, i_3 + 14, i_15, -1);
         i_7 = MouseHandler.MouseHandler_x;
         i_8 = MouseHandler.MouseHandler_y;

         int i_16;
         int i_17;
         for (i_14 = 0; i_14 < menuOptionsCount; i_14++) {
            i_16 = i_3 + (menuOptionsCount - 1 - i_14) * 15 + 31;
            i_17 = 16777215;
            if (i_7 > i_2 && i_7 < i_2 + i_4 && i_8 > i_16 - 13 && i_8 < i_16 + 3) {
               i_17 = 16776960;
            }

            class23.fontBold12.draw(class28.method417(i_14), i_2 + 3, i_16, i_17, 0);
         }

         i_14 = class247.field3292;
         i_16 = class30.field267;
         i_17 = WorldMapRectangle.field373;
         int i_18 = class75.field1092;

         for (int i_13 = 0; i_13 < field858; i_13++) {
            if (field808[i_13] + field865[i_13] > i_14 && field808[i_13] < i_14 + i_17 && field860[i_13] + field864[i_13] > i_16 && field864[i_13] < i_16 + i_18) {
               field861[i_13] = true;
            }
         }
      }

      if (field768 == 3) {
         for (i_2 = 0; i_2 < field858; i_2++) {
            if (field862[i_2]) {
               Rasterizer2D.method6004(field808[i_2], field864[i_2], field865[i_2], field860[i_2], 16711935, 128);
            } else if (field861[i_2]) {
               Rasterizer2D.method6004(field808[i_2], field864[i_2], field865[i_2], field860[i_2], 16711680, 128);
            }
         }
      }

      i_2 = WorldMapRectangle.plane;
      i_3 = localPlayer.x;
      i_4 = localPlayer.y;
      i_5 = field718;

      for (class75 class75_6 = (class75) class75.field1080.method4892(); class75_6 != null; class75_6 = (class75) class75.field1080.method4894()) {
         if (class75_6.field1079 != -1 || class75_6.field1088 != null) {
            i_7 = 0;
            if (i_3 > class75_6.field1077) {
               i_7 += i_3 - class75_6.field1077;
            } else if (i_3 < class75_6.field1083) {
               i_7 += class75_6.field1083 - i_3;
            }

            if (i_4 > class75_6.field1082) {
               i_7 += i_4 - class75_6.field1082;
            } else if (i_4 < class75_6.field1090) {
               i_7 += class75_6.field1090 - i_4;
            }

            if (i_7 - 64 <= class75_6.field1091 && field892 != 0 && i_2 == class75_6.field1078) {
               i_7 -= 64;
               if (i_7 < 0) {
                  i_7 = 0;
               }

               i_8 = (class75_6.field1091 - i_7) * field892 / class75_6.field1091;
               Object obj_10000;
               if (class75_6.field1085 == null) {
                  if (class75_6.field1079 >= 0) {
                     obj_10000 = null;
                     class101 class101_9 = class101.method2334(class13.field89, class75_6.field1079, 0);
                     if (class101_9 != null) {
                        RawSound rawSound_10 = class101_9.method2330().method2376(class84.field1177);
                        class113 class113_11 = class113.method2529(rawSound_10, 100, i_8);
                        class113_11.method2626(-1);
                        class57.field532.method2286(class113_11);
                        class75_6.field1085 = class113_11;
                     }
                  }
               } else {
                  class75_6.field1085.method2527(i_8);
               }

               if (class75_6.field1084 == null) {
                  if (class75_6.field1088 != null && (class75_6.field1089 -= i_5) <= 0) {
                     i_14 = (int)(Math.random() * (double)class75_6.field1088.length);
                     obj_10000 = null;
                     class101 class101_19 = class101.method2334(class13.field89, class75_6.field1088[i_14], 0);
                     if (class101_19 != null) {
                        RawSound rawSound_20 = class101_19.method2330().method2376(class84.field1177);
                        class113 class113_12 = class113.method2529(rawSound_20, 100, i_8);
                        class113_12.method2626(0);
                        class57.field532.method2286(class113_12);
                        class75_6.field1084 = class113_12;
                        class75_6.field1089 = class75_6.field1086 + (int)(Math.random() * (double)(class75_6.field1081 - class75_6.field1086));
                     }
                  }
               } else {
                  class75_6.field1084.method2527(i_8);
                  if (!class75_6.field1084.isLinked()) {
                     class75_6.field1084 = null;
                  }
               }
            } else {
               if (class75_6.field1085 != null) {
                  class57.field532.method2293(class75_6.field1085);
                  class75_6.field1085 = null;
               }

               if (class75_6.field1084 != null) {
                  class57.field532.method2293(class75_6.field1084);
                  class75_6.field1084 = null;
               }
            }
         }
      }

      field718 = 0;
   }

   protected final void vmethod1252() {
      field868 = TimeUtils.getAdjustedTimeMillis() + 500L;
      this.method1253();
      if (field905 != -1) {
         this.method1293(true);
      }

   }

   protected final void vmethod1599() {
      ++cycle;
      this.method1247();

      while (true) {
         NodeDeque nodeDeque_3 = class234.field3146;
         class231 class231_2;
         synchronized (class234.field3146) {
            class231_2 = (class231) class234.field3145.method4900();
         }

         if (class231_2 == null) {
            int i_7;
            try {
               if (class197.field2402 == 1) {
                  i_7 = MouseRecorder.field1099.method3707();
                  if (i_7 > 0 && MouseRecorder.field1099.method3713()) {
                     i_7 -= class197.field2404;
                     if (i_7 < 0) {
                        i_7 = 0;
                     }

                     MouseRecorder.field1099.method3706(i_7);
                  } else {
                     MouseRecorder.field1099.method3712();
                     MouseRecorder.field1099.method3710();
                     if (class11.field76 != null) {
                        class197.field2402 = 2;
                     } else {
                        class197.field2402 = 0;
                     }

                     class154.field1981 = null;
                     class17.field119 = null;
                  }
               }
            } catch (Exception exception_12) {
               exception_12.printStackTrace();
               MouseRecorder.field1099.method3712();
               class197.field2402 = 0;
               class154.field1981 = null;
               class17.field119 = null;
               class11.field76 = null;
            }

            class186.method3619((byte) 33);
            class45 class45_13 = class45.field392;
            synchronized (class45.field392) {
               ++class45.field406;
               class45.field396 = class45.field385;
               class45.field386 = 0;
               int i_8;
               if (class45.field398 >= 0) {
                  while (class45.field388 != class45.field398) {
                     i_8 = class45.field391[class45.field388];
                     class45.field388 = class45.field388 + 1 & 0x7f;
                     if (i_8 < 0) {
                        class45.field395[~i_8] = false;
                     } else {
                        if (!class45.field395[i_8] && class45.field386 < class45.field401.length - 1) {
                           class45.field401[++class45.field386 - 1] = i_8;
                        }

                        class45.field395[i_8] = true;
                     }
                  }
               } else {
                  for (i_8 = 0; i_8 < 112; i_8++) {
                     class45.field395[i_8] = false;
                  }

                  class45.field398 = class45.field388;
               }

               if (class45.field386 > 0) {
                  class45.field406 = 0;
               }

               class45.field385 = class45.field404;
            }

            MouseHandler mouseHandler_14 = MouseHandler.field479;
            synchronized (MouseHandler.field479) {
               MouseHandler.field485 = MouseHandler.field481;
               MouseHandler.MouseHandler_x = MouseHandler.field488;
               MouseHandler.MouseHandler_y = MouseHandler.field477;
               MouseHandler.field482 = MouseHandler.field484;
               MouseHandler.field493 = MouseHandler.field489;
               MouseHandler.field483 = MouseHandler.field490;
               MouseHandler.field495 = MouseHandler.field491;
               MouseHandler.field497 = MouseHandler.field500;
               MouseHandler.field489 = 0;
            }

            if (class36.field329 != null) {
               i_7 = class36.field329.vmethod3496(1768142580);
               field853 = i_7;
            }

            if (field662 == 0) {
               Timer.startUpInitialization();
               class141.method3291();
            } else if (field662 == 5) {
               class248.method4484();
               Timer.startUpInitialization();
               class141.method3291();
            } else if (field662 != 10 && field662 != 11) {
               if (field662 == 20) {
                  class248.method4484();
                  this.pushLoginData();
               } else if (field662 == 25) {
                  class187.method3628();
               }
            } else {
               class248.method4484();
            }

            if (field662 == 30) {
               this.method1251();
            } else if (field662 == 40 || field662 == 45) {
               this.pushLoginData();
            }

            return;
         }

         class231_2.field3117.method4264(class231_2.field3116, (int) class231_2.hash, class231_2.field3115, false);
      }
   }

   protected void vmethod1493(boolean bool_1) {
      boolean bool_3;
      label168: {
         try {
            if (class197.field2402 == 2) {
               if (class154.field1981 == null) {
                  class154.field1981 = class203.method3917(class11.field76, class197.field2403, class197.field2407);
                  if (class154.field1981 == null) {
                     bool_3 = false;
                     break label168;
                  }
               }

               if (class17.field119 == null) {
                  class17.field119 = new class108(class197.field2401, class197.field2400);
               }

               if (MouseRecorder.field1099.method3719(class154.field1981, class197.field2406, class17.field119, 22050)) {
                  MouseRecorder.field1099.method3775();
                  MouseRecorder.field1099.method3706(class56.field529);
                  MouseRecorder.field1099.method3802(class154.field1981, class158.field1992);
                  class197.field2402 = 0;
                  class154.field1981 = null;
                  class17.field119 = null;
                  class11.field76 = null;
                  bool_3 = true;
                  break label168;
               }
            }
         } catch (Exception exception_7) {
            exception_7.printStackTrace();
            MouseRecorder.field1099.method3712();
            class197.field2402 = 0;
            class154.field1981 = null;
            class17.field119 = null;
            class11.field76 = null;
         }

         bool_3 = false;
      }

      if (bool_3 && field699 && WorldMapElement.field1144 != null) {
         WorldMapElement.field1144.method2408();
      }

      if ((field662 == 10 || field662 == 20 || field662 == 30) && field868 != 0L && TimeUtils.getAdjustedTimeMillis() > field868) {
         class170.method3515(class34.method598());
      }

      int i_5;
      if (bool_1) {
         for (i_5 = 0; i_5 < 100; i_5++) {
            field843[i_5] = true;
         }
      }

      if (field662 == 0) {
         this.drawInitial(Login.field1188, Login.field1189, bool_1);
      } else if (field662 == 5) {
         BufferPoolConfig.drawLoginScreen(class23.fontBold12, class213.field2529, class169.field2054);
      } else if (field662 != 10 && field662 != 11) {
         if (field662 == 20) {
            BufferPoolConfig.drawLoginScreen(class23.fontBold12, class213.field2529, class169.field2054);
         } else if (field662 == 25) {
            if (field709 == 1) {
               if (field705 > field706) {
                  field706 = field705;
               }

               i_5 = (field706 * 50 - field705 * 50) / field706;
               class281.method5180("Loading - please wait." + "<br>" + " (" + i_5 + "%" + ")", false);
            } else if (field709 == 2) {
               if (field707 > field896) {
                  field896 = field707;
               }

               i_5 = (field896 * 50 - field707 * 50) / field896 + 50;
               class281.method5180("Loading - please wait." + "<br>" + " (" + i_5 + "%" + ")", false);
            } else {
               class281.method5180("Loading - please wait.", false);
            }
         } else if (field662 == 30) {
            this.method1254();
         } else if (field662 == 40) {
            class281.method5180("Connection lost" + "<br>" + "Please wait - attempting to reestablish", false);
         } else if (field662 == 45) {
            class281.method5180("Please wait...", false);
         }
      } else {
         BufferPoolConfig.drawLoginScreen(class23.fontBold12, class213.field2529, class169.field2054);
      }

      if (field662 == 30 && field768 == 0 && !bool_1 && !resizeSettings) {
         for (i_5 = 0; i_5 < field858; i_5++) {
            if (field861[i_5]) {
               class202.field2486.vmethod6075(field808[i_5], field864[i_5], field865[i_5], field860[i_5], 1902391505);
               field861[i_5] = false;
            }
         }
      } else if (field662 > 0) {
         class202.field2486.vmethod6077(0, 0);

         for (i_5 = 0; i_5 < field858; i_5++) {
            field861[i_5] = false;
         }
      }

   }

   void method1248() {
      if (class236.field3179 >= 4) {
         this.loadingError("js5crc");
         field662 = 1000;
      } else {
         if (class236.field3178 >= 4) {
            if (field662 <= 5) {
               this.loadingError("js5io");
               field662 = 1000;
               return;
            }

            field682 = 3000;
            class236.field3178 = 3;
         }

         if (--field682 + 1 <= 0) {
            try {
               if (field681 == 0) {
                  class191.field2363 = GameApplet.field463.method3478(class73.field1068, class90.field1266);
                  ++field681;
               }

               if (field681 == 1) {
                  if (class191.field2363.field2022 == 2) {
                     this.method1249(-1);
                     return;
                  }

                  if (class191.field2363.field2022 == 1) {
                     ++field681;
                  }
               }

               if (field681 == 2) {
                  if (field815) {
                     class70.field1015 = class303.method5770((Socket) class191.field2363.field2025, 40000, 5000, (byte) 10);
                  } else {
                     class70.field1015 = new class171((Socket) class191.field2363.field2025, GameApplet.field463, 5000);
                  }

                  ByteBuffer class300_2 = new ByteBuffer(5);
                  class300_2.writeByte(15);
                  class300_2.writeIntBigEndian(181);
                  class70.field1015.vmethod5829(class300_2.buffer, 0, 5, -1696227994);
                  ++field681;
                  class192.field2382 = TimeUtils.getAdjustedTimeMillis();
               }

               if (field681 == 3) {
                  if (class70.field1015.vmethod5826((byte) 28) > 0 || !field815 && field662 <= 5) {
                     int i_3 = class70.field1015.vmethod5825((byte) 2);
                     if (i_3 != 0) {
                        this.method1249(i_3);
                        return;
                     }

                     ++field681;
                  } else if (TimeUtils.getAdjustedTimeMillis() - class192.field2382 > 30000L) {
                     this.method1249(-2);
                     return;
                  }
               }

               if (field681 == 4) {
                  class93.method2193(class70.field1015, field662 > 20, (short) -31468);
                  class191.field2363 = null;
                  class70.field1015 = null;
                  field681 = 0;
                  field685 = 0;
               }
            } catch (IOException ioexception_4) {
               this.method1249(-3);
            }

         }
      }
   }

   final void method1251() {
      if (field669 > 1) {
         --field669;
      }

      if (field700 > 0) {
         --field700;
      }

      if (field701) {
         field701 = false;
         class56.method1090();
      } else {
         if (!field674) {
            class77.method1945();
         }

         int i_2;
         for (i_2 = 0; i_2 < 100 && this.parsePacket(); i_2++) {

            ;
         }

         if (field662 == 30) {
            int i_3;
            class187 class187_16;
            while (class198.method3811()) {
               class187_16 = class235.method4265(ClientPacketProt.field2252, data.field1313);
               class187_16.outBuffer.writeByte(0);
               i_3 = class187_16.outBuffer.position;
               class70.method1671(class187_16.outBuffer);
               class187_16.outBuffer.writeSizeAtOffset(class187_16.outBuffer.position - i_3);
               data.copy(class187_16);
            }

            if (timer.field3605) {
               class187_16 = class235.method4265(ClientPacketProt.field2217, data.field1313);
               class187_16.outBuffer.writeByte(0);
               i_3 = class187_16.outBuffer.position;
               timer.method4999(class187_16.outBuffer);
               class187_16.outBuffer.writeSizeAtOffset(class187_16.outBuffer.position - i_3);
               data.copy(class187_16);
               timer.method4998();
            }

            Object object_36 = FontName.field348.field589;
            int i_4;
            int i_5;
            int i_6;
            int i_7;
            int i_8;
            int i_9;
            int i_10;
            int i_11;
            int i_12;
            int i_13;
            synchronized (FontName.field348.field589) {
               if (!field912) {
                  FontName.field348.field592 = 0;
               } else if (MouseHandler.field493 != 0 || FontName.field348.field592 >= 40) {
                  class187 class187_17 = null;
                  i_4 = 0;
                  i_5 = 0;
                  i_6 = 0;
                  i_7 = 0;

                  for (i_8 = 0; i_8 < FontName.field348.field592 && (class187_17 == null || class187_17.outBuffer.position - i_4 < 246); i_8++) {
                     i_5 = i_8;
                     i_9 = FontName.field348.field588[i_8];
                     if (i_9 < -1) {
                        i_9 = -1;
                     } else if (i_9 > 65534) {
                        i_9 = 65534;
                     }

                     i_10 = FontName.field348.field591[i_8];
                     if (i_10 < -1) {
                        i_10 = -1;
                     } else if (i_10 > 65534) {
                        i_10 = 65534;
                     }

                     if (i_10 != field717 || i_9 != field665) {
                        if (class187_17 == null) {
                           class187_17 = class235.method4265(ClientPacketProt.field2237, data.field1313);
                           class187_17.outBuffer.writeByte(0);
                           i_4 = class187_17.outBuffer.position;
                           class187_17.outBuffer.position += 2;
                           i_6 = 0;
                           i_7 = 0;
                        }

                        if (field666 != -1L) {
                           i_11 = i_10 - field717;
                           i_12 = i_9 - field665;
                           i_13 = (int) ((FontName.field348.field593[i_8] - field666) / 20L);
                           i_6 = (int) ((long) i_6 + (FontName.field348.field593[i_8] - field666) % 20L);
                        } else {
                           i_11 = i_10;
                           i_12 = i_9;
                           i_13 = Integer.MAX_VALUE;
                        }

                        field717 = i_10;
                        field665 = i_9;
                        if (i_13 < 8 && i_11 >= -32 && i_11 <= 31 && i_12 >= -32 && i_12 <= 31) {
                           i_11 += 32;
                           i_12 += 32;
                           class187_17.outBuffer.writeShortBigEndian((i_13 << 12) + i_12 + (i_11 << 6));
                        } else if (i_13 < 32 && i_11 >= -128 && i_11 <= 127 && i_12 >= -128 && i_12 <= 127) {
                           i_11 += 128;
                           i_12 += 128;
                           class187_17.outBuffer.writeByte(i_13 + 128);
                           class187_17.outBuffer.writeShortBigEndian(i_12 + (i_11 << 8));
                        } else if (i_13 < 32) {
                           class187_17.outBuffer.writeByte(i_13 + 192);
                           if (i_10 != -1 && i_9 != -1) {
                              class187_17.outBuffer.writeIntBigEndian(i_10 | i_9 << 16);
                           } else {
                              class187_17.outBuffer.writeIntBigEndian(Integer.MIN_VALUE);
                           }
                        } else {
                           class187_17.outBuffer.writeShortBigEndian((i_13 & 0x1fff) + 57344);
                           if (i_10 != -1 && i_9 != -1) {
                              class187_17.outBuffer.writeIntBigEndian(i_10 | i_9 << 16);
                           } else {
                              class187_17.outBuffer.writeIntBigEndian(Integer.MIN_VALUE);
                           }
                        }

                        ++i_7;
                        field666 = FontName.field348.field593[i_8];
                     }
                  }

                  if (class187_17 != null) {
                     class187_17.outBuffer.writeSizeAtOffset(class187_17.outBuffer.position - i_4);
                     i_8 = class187_17.outBuffer.position;
                     class187_17.outBuffer.position = i_4;
                     class187_17.outBuffer.writeByte(i_6 / i_7);
                     class187_17.outBuffer.writeByte(i_6 % i_7);
                     class187_17.outBuffer.position = i_8;
                     data.copy(class187_17);
                  }

                  if (i_5 >= FontName.field348.field592) {
                     FontName.field348.field592 = 0;
                  } else {
                     FontName.field348.field592 -= i_5;
                     System.arraycopy(FontName.field348.field591, i_5, FontName.field348.field591, 0, FontName.field348.field592);
                     System.arraycopy(FontName.field348.field588, i_5, FontName.field348.field588, 0, FontName.field348.field592);
                     System.arraycopy(FontName.field348.field593, i_5, FontName.field348.field593, 0, FontName.field348.field592);
                  }
               }
            }

            class187 class187_20;
            if (MouseHandler.field493 == 1 || !class46.field413 && MouseHandler.field493 == 4 || MouseHandler.field493 == 2) {
               long long_18 = (MouseHandler.field497 - field663 * -1L) / 50L;
               if (long_18 > 4095L) {
                  long_18 = 4095L;
               }

               field663 = MouseHandler.field497 * -1L;
               i_4 = MouseHandler.field495;
               if (i_4 < 0) {
                  i_4 = 0;
               } else if (i_4 > ParamComposition.clientHeight) {
                  i_4 = ParamComposition.clientHeight;
               }

               i_5 = MouseHandler.field483;
               if (i_5 < 0) {
                  i_5 = 0;
               } else if (i_5 > class7.clientWidth) {
                  i_5 = class7.clientWidth;
               }

               i_6 = (int)long_18;
               class187_20 = class235.method4265(ClientPacketProt.field2234, data.field1313);
               class187_20.outBuffer.writeShortBigEndian((MouseHandler.field493 == 2 ? 1 : 0) + (i_6 << 1));
               class187_20.outBuffer.writeShortBigEndian(i_5);
               class187_20.outBuffer.writeShortBigEndian(i_4);
               data.copy(class187_20);
            }

            if (class45.field386 > 0) {
               class187_16 = class235.method4265(ClientPacketProt.field2270, data.field1313);
               class187_16.outBuffer.writeShortBigEndian(0);
               i_3 = class187_16.outBuffer.position;
               long long_21 = TimeUtils.getAdjustedTimeMillis();

               for (i_6 = 0; i_6 < class45.field386; i_6++) {
                  long long_23 = long_21 - field879;
                  if (long_23 > 16777215L) {
                     long_23 = 16777215L;
                  }

                  field879 = long_21;
                  class187_16.outBuffer.writeNegatedByte(class45.field401[i_6]);
                  class187_16.outBuffer.write24BitInt((int)long_23);
               }

               class187_16.outBuffer.writeShortSizeAtOffset(class187_16.outBuffer.position - i_3);
               data.copy(class187_16);
            }

            if (field822 > 0) {
               --field822;
            }

            if (class45.field395[96] || class45.field395[97] || class45.field395[98] || class45.field395[99]) {
               field878 = true;
            }

            if (field878 && field822 <= 0) {
               field822 = 20;
               field878 = false;
               class187_16 = class235.method4265(ClientPacketProt.field2242, data.field1313);
               class187_16.outBuffer.writeShortWithOffset(field721);
               class187_16.outBuffer.writeShortLittleEndian(camAngleY);
               data.copy(class187_16);
            }

            if (class267.field3557 && !field667) {
               field667 = true;
               class187_16 = class235.method4265(ClientPacketProt.field2276, data.field1313);
               class187_16.outBuffer.writeByte(1);
               data.copy(class187_16);
            }

            if (!class267.field3557 && field667) {
               field667 = false;
               class187_16 = class235.method4265(ClientPacketProt.field2276, data.field1313);
               class187_16.outBuffer.writeByte(0);
               data.copy(class187_16);
            }

            if (class136.field1875 != null) {
               class136.field1875.method6299();
            }

            class45.method801();
            int[] ints_38;
            if (field747 != WorldMapRectangle.plane) {
               field747 = WorldMapRectangle.plane;
               i_2 = WorldMapRectangle.plane;
               ints_38 = ParamDefinition.sceneMinimapSprite.field3908;
               i_4 = ints_38.length;

               for (i_5 = 0; i_5 < i_4; i_5++) {
                  ints_38[i_5] = 0;
               }

               for (i_5 = 1; i_5 < 103; i_5++) {
                  i_6 = (103 - i_5) * 2048 + 24628;

                  for (i_7 = 1; i_7 < 103; i_7++) {
                     if ((class55.field502[i_2][i_7][i_5] & 0x18) == 0) {
                        class5.scene.method3232(ints_38, i_6, 512, i_2, i_7, i_5);
                     }

                     if (i_2 < 3 && (class55.field502[i_2 + 1][i_7][i_5] & 0x8) != 0) {
                        class5.scene.method3232(ints_38, i_6, 512, i_2 + 1, i_7, i_5);
                     }

                     i_6 += 4;
                  }
               }

               i_5 = (238 + (int)(Math.random() * 20.0D) - 10 << 16) + (238 + (int)(Math.random() * 20.0D) - 10 << 8) + (238 + (int)(Math.random() * 20.0D) - 10);
               i_6 = 238 + (int)(Math.random() * 20.0D) - 10 << 16;
               ParamDefinition.sceneMinimapSprite.method6114();

               for (i_7 = 1; i_7 < 103; i_7++) {
                  for (i_8 = 1; i_8 < 103; i_8++) {
                     if ((class55.field502[i_2][i_8][i_7] & 0x18) == 0) {
                        class3.method37(i_2, i_8, i_7, i_5, i_6);
                     }

                     if (i_2 < 3 && (class55.field502[i_2 + 1][i_8][i_7] & 0x8) != 0) {
                        class3.method37(i_2 + 1, i_8, i_7, i_5, i_6);
                     }
                  }
               }

               mapIconCount = 0;

               for (i_7 = 0; i_7 < 104; i_7++) {
                  for (i_8 = 0; i_8 < 104; i_8++) {
                     long long_25 = class5.scene.method3095(WorldMapRectangle.plane, i_7, i_8);
                     if (long_25 != 0L) {
                        i_11 = GCMonitor.method770(long_25);
                        i_12 = class128.method2970(i_11).field3378;
                        if (i_12 >= 0) {
                           field786[mapIconCount] = class222.method4118(i_12).method4379();
                           mapIconXs[mapIconCount] = i_7;
                           mapIconYs[mapIconCount] = i_8;
                           ++mapIconCount;
                        }
                     }
                  }
               }

               class202.field2486.method6078();
            }

            if (field662 == 30) {
               for (class68 class68_37 = (class68) field783.method4892(); class68_37 != null; class68_37 = (class68) field783.method4894()) {
                  if (class68_37.field931 > 0) {
                     --class68_37.field931;
                  }

                  if (class68_37.field931 == 0) {
                     if (class68_37.field935 < 0 || class89.method2091(class68_37.field935, class68_37.field933, 2142202681)) {
                        TimeUtils.method3938(class68_37.field943, class68_37.field932, class68_37.field937, class68_37.field934, class68_37.field935, class68_37.field936, class68_37.field933);
                        class68_37.unlink();
                     }
                  } else {
                     if (class68_37.field941 > 0) {
                        --class68_37.field941;
                     }

                     if (class68_37.field941 == 0 && class68_37.field937 >= 1 && class68_37.field934 >= 1 && class68_37.field937 <= 102 && class68_37.field934 <= 102 && (class68_37.field938 < 0 || class89.method2091(class68_37.field938, class68_37.field940, 2036595705))) {
                        TimeUtils.method3938(class68_37.field943, class68_37.field932, class68_37.field937, class68_37.field934, class68_37.field938, class68_37.field939, class68_37.field940);
                        class68_37.field941 = -1;
                        if (class68_37.field938 == class68_37.field935 && class68_37.field935 == -1) {
                           class68_37.unlink();
                        } else if (class68_37.field935 == class68_37.field938 && class68_37.field936 == class68_37.field939 && class68_37.field933 == class68_37.field940) {
                           class68_37.unlink();
                        }
                     }
                  }
               }

               class245.method4461(1752614077);
               ++data.field1318;
               if (data.field1318 > 750) {
                  class56.method1090();
               } else {
                  i_2 = class89.field1255;
                  ints_38 = class89.field1257;

                  for (i_4 = 0; i_4 < i_2; i_4++) {
                     class66 class66_27 = field909[ints_38[i_4]];
                     if (class66_27 != null) {
                        class250.method4531(class66_27, 1, (byte) 16);
                     }
                  }

                  class63.method1141();
                  class66.method1203(1715272698);
                  ++field718;
                  if (field757 != 0) {
                     field756 += 20;
                     if (field756 >= 400) {
                        field757 = 0;
                     }
                  }

                  if (class59.field549 != null) {
                     ++field759;
                     if (field759 >= 15) {
                        Widget2.invalidateWidget(class59.field549);
                        class59.field549 = null;
                     }
                  }

                  Widget widget_39 = class72.field1059;
                  Widget widget_40 = class32.field284;
                  class72.field1059 = null;
                  class32.field284 = null;
                  field832 = null;
                  field745 = false;
                  field873 = false;
                  field754 = 0;

                  while (class218.method4109() && field754 < 128) {
                     //..Some kind of admin map movement
                     if (localRights >= 2 && class45.field395[82] && class97.field1338 == 66) {
                        String string_28 = class143.method3305();
                        WorldMapID.client.method879(string_28);
                     } else if (field727 != 1 || class207.field2508 <= 0) {
                        field921[field754] = class97.field1338;
                        field877[field754] = class207.field2508;
                        ++field754;
                     }
                  }

                  boolean administrator = localRights >= 2;
                  if (administrator
                          && class45.field395[82] && class45.field395[81] && field853 != 0) {
                     i_5 = localPlayer.field629 - field853;
                     if (i_5 < 0) {
                        i_5 = 0;
                     } else if (i_5 > 3) {
                        i_5 = 3;
                     }

                     if (i_5 != localPlayer.field629) {
                        class28.method418(localPlayer.field994[0] + class196.field2389, localPlayer.field962[0] + SceneNode.field1, i_5, false, -1379117889);
                     }

                     field853 = 0;
                  }

                  if (field905 != -1) {
                     class221.method4116(field905, 0, 0, class7.clientWidth, ParamComposition.clientHeight, 0, 0);
                  }

                  ++field673;

                  while (true) {
                     Widget widget_29;
                     Widget widget_41;
                     MusicPatchPcmStream musicPatchPcmStream_43;
                     do {
                        musicPatchPcmStream_43 = (MusicPatchPcmStream) field852.method4900();
                        if (musicPatchPcmStream_43 == null) {
                           while (true) {
                              do {
                                 musicPatchPcmStream_43 = (MusicPatchPcmStream) field856.method4900();
                                 if (musicPatchPcmStream_43 == null) {
                                    while (true) {
                                       do {
                                          musicPatchPcmStream_43 = (MusicPatchPcmStream) field854.method4900();
                                          if (musicPatchPcmStream_43 == null) {
                                             this.method1333();
                                             class243.method4415();
                                             if (field828 != null) {
                                                this.method1641();
                                             }

                                             if (Buffer.field127 != null) {
                                                Widget2.invalidateWidget(Buffer.field127);
                                                ++field766;
                                                if (MouseHandler.field485 == 0) {
                                                   if (field874) {
                                                      if (class294.field3697 == Buffer.field127 && field764 != field765) {
                                                         Widget widget_44 = Buffer.field127;
                                                         byte b_35 = 0;
                                                         if (field809 == 1 && widget_44.field2568 == 206) {
                                                            b_35 = 1;
                                                         }

                                                         if (widget_44.field2560[field764] <= 0) {
                                                            b_35 = 0;
                                                         }

                                                         if (class151.method3382(class268.method4987(widget_44), 1492423821)) {
                                                            i_7 = field765;
                                                            i_8 = field764;
                                                            widget_44.field2560[i_8] = widget_44.field2560[i_7];
                                                            widget_44.field2705[i_8] = widget_44.field2705[i_7];
                                                            widget_44.field2560[i_7] = -1;
                                                            widget_44.field2705[i_7] = 0;
                                                         } else if (b_35 == 1) {
                                                            i_7 = field765;
                                                            i_8 = field764;

                                                            while (i_7 != i_8) {
                                                               if (i_7 > i_8) {
                                                                  widget_44.method4063(i_7 - 1, i_7);
                                                                  --i_7;
                                                               } else if (i_7 < i_8) {
                                                                  widget_44.method4063(i_7 + 1, i_7);
                                                                  ++i_7;
                                                               }
                                                            }
                                                         } else {
                                                            widget_44.method4063(field764, field765);
                                                         }

                                                         class187_20 = class235.method4265(ClientPacketProt.IF_ITEM_DRAG_OT, data.field1313);
                                                         class187_20.outBuffer.writeShortBigEndian(field764);
                                                         class187_20.outBuffer.writeShortLittleEndian(field765);
                                                         class187_20.outBuffer.writeIntBigEndian(Buffer.field127.field2688);
                                                         class187_20.outBuffer.writeNegatedByte(b_35);
                                                         data.copy(class187_20);
                                                      }
                                                   } else if (this.method1257()) {
                                                      this.method1274(field654, field763);
                                                   } else if (menuOptionsCount > 0) {
                                                      i_5 = field654;
                                                      i_6 = field763;
                                                      class82 class82_42 = field916;
                                                      class91.writeSomePacket(class82_42.field1157, class82_42.field1156, class82_42.field1155, class82_42.field1158, class82_42.field1159, i_5, i_6);
                                                      field916 = null;
                                                   }

                                                   field759 = 10;
                                                   MouseHandler.field493 = 0;
                                                   Buffer.field127 = null;
                                                } else if (field766 >= 5 && (MouseHandler.MouseHandler_x > field654 + 5 || MouseHandler.MouseHandler_x < field654 - 5 || MouseHandler.MouseHandler_y > field763 + 5 || MouseHandler.MouseHandler_y < field763 - 5)) {
                                                   field874 = true;
                                                }
                                             }

                                             if (Scene.method3105()) {
                                                i_5 = Scene.clickTileX;
                                                i_6 = Scene.clickTileZ;
                                                class187_20 = class235.method4265(ClientPacketProt.field2299, data.field1313);
                                                class187_20.outBuffer.writeByte(5);
                                                class187_20.outBuffer.writeUnsignedShortA(i_6 + SceneNode.field1);
                                                class187_20.outBuffer.writeUnsignedShortA(i_5 + class196.field2389);
                                                class187_20.outBuffer.writeOffsetByte(class45.field395[82] ? (class45.field395[81] ? 2 : 1) : 0);
                                                data.copy(class187_20);
                                                Scene.method3222();
                                                field876 = MouseHandler.field483;
                                                field755 = MouseHandler.field495;
                                                field757 = 1;
                                                field756 = 0;
                                                destinationX = i_5;
                                                destinationY = i_6;
                                             }

                                             if (widget_39 != class72.field1059) {
                                                if (widget_39 != null) {
                                                   Widget2.invalidateWidget(widget_39);
                                                }

                                                if (class72.field1059 != null) {
                                                   Widget2.invalidateWidget(class72.field1059);
                                                }
                                             }

                                             if (widget_40 != class32.field284 && field840 == field833) {
                                                if (widget_40 != null) {
                                                   Widget2.invalidateWidget(widget_40);
                                                }

                                                if (class32.field284 != null) {
                                                   Widget2.invalidateWidget(class32.field284);
                                                }
                                             }

                                             if (class32.field284 != null) {
                                                if (field840 < field833) {
                                                   ++field840;
                                                   if (field840 == field833) {
                                                      Widget2.invalidateWidget(class32.field284);
                                                   }
                                                }
                                             } else if (field840 > 0) {
                                                --field840;
                                             }

                                             WorldMapElement.method1982();
                                             if (field899) {
                                                i_5 = class46.field412 * 128 + 64;
                                                i_6 = class210.field2516 * 128 + 64;
                                                i_7 = MusicPatchPcmStream.getTileHeight(i_5, i_6, WorldMapRectangle.plane) - class190.field2345;
                                                if (PacketBuffer.field3727 < i_5) {
                                                   PacketBuffer.field3727 = (i_5 - PacketBuffer.field3727) * class96.field1327 / 1000 + PacketBuffer.field3727 + class83.field1166;
                                                   if (PacketBuffer.field3727 > i_5) {
                                                      PacketBuffer.field3727 = i_5;
                                                   }
                                                }

                                                if (PacketBuffer.field3727 > i_5) {
                                                   PacketBuffer.field3727 -= class96.field1327 * (PacketBuffer.field3727 - i_5) / 1000 + class83.field1166;
                                                   if (PacketBuffer.field3727 < i_5) {
                                                      PacketBuffer.field3727 = i_5;
                                                   }
                                                }

                                                if (GCMonitor.field383 < i_7) {
                                                   GCMonitor.field383 = (i_7 - GCMonitor.field383) * class96.field1327 / 1000 + GCMonitor.field383 + class83.field1166;
                                                   if (GCMonitor.field383 > i_7) {
                                                      GCMonitor.field383 = i_7;
                                                   }
                                                }

                                                if (GCMonitor.field383 > i_7) {
                                                   GCMonitor.field383 -= class96.field1327 * (GCMonitor.field383 - i_7) / 1000 + class83.field1166;
                                                   if (GCMonitor.field383 < i_7) {
                                                      GCMonitor.field383 = i_7;
                                                   }
                                                }

                                                if (SceneNode.field3 < i_6) {
                                                   SceneNode.field3 = (i_6 - SceneNode.field3) * class96.field1327 / 1000 + SceneNode.field3 + class83.field1166;
                                                   if (SceneNode.field3 > i_6) {
                                                      SceneNode.field3 = i_6;
                                                   }
                                                }

                                                if (SceneNode.field3 > i_6) {
                                                   SceneNode.field3 -= class96.field1327 * (SceneNode.field3 - i_6) / 1000 + class83.field1166;
                                                   if (SceneNode.field3 < i_6) {
                                                      SceneNode.field3 = i_6;
                                                   }
                                                }

                                                i_5 = class70.field1017 * 128 + 64;
                                                i_6 = class30.field259 * 128 + 64;
                                                i_7 = MusicPatchPcmStream.getTileHeight(i_5, i_6, WorldMapRectangle.plane) - class31.field268;
                                                i_8 = i_5 - PacketBuffer.field3727;
                                                i_9 = i_7 - GCMonitor.field383;
                                                i_10 = i_6 - SceneNode.field3;
                                                i_11 = (int)Math.sqrt((double)(i_8 * i_8 + i_10 * i_10));
                                                i_12 = (int)(Math.atan2((double)i_9, (double)i_11) * 325.949D) & 0x7ff;
                                                i_13 = (int)(Math.atan2((double)i_8, (double)i_10) * -325.949D) & 0x7ff;
                                                if (i_12 < 128) {
                                                   i_12 = 128;
                                                }

                                                if (i_12 > 383) {
                                                   i_12 = 383;
                                                }

                                                if (class11.field77 < i_12) {
                                                   class11.field77 = (i_12 - class11.field77) * class55.field501 / 1000 + class11.field77 + class56.field526;
                                                   if (class11.field77 > i_12) {
                                                      class11.field77 = i_12;
                                                   }
                                                }

                                                if (class11.field77 > i_12) {
                                                   class11.field77 -= class55.field501 * (class11.field77 - i_12) / 1000 + class56.field526;
                                                   if (class11.field77 < i_12) {
                                                      class11.field77 = i_12;
                                                   }
                                                }

                                                int i_30 = i_13 - MouseRecorder.field1112;
                                                if (i_30 > 1024) {
                                                   i_30 -= 2048;
                                                }

                                                if (i_30 < -1024) {
                                                   i_30 += 2048;
                                                }

                                                if (i_30 > 0) {
                                                   MouseRecorder.field1112 = i_30 * class55.field501 / 1000 + MouseRecorder.field1112 + class56.field526;
                                                   MouseRecorder.field1112 &= 0x7ff;
                                                }

                                                if (i_30 < 0) {
                                                   MouseRecorder.field1112 -= -i_30 * class55.field501 / 1000 + class56.field526;
                                                   MouseRecorder.field1112 &= 0x7ff;
                                                }

                                                int i_15 = i_13 - MouseRecorder.field1112;
                                                if (i_15 > 1024) {
                                                   i_15 -= 2048;
                                                }

                                                if (i_15 < -1024) {
                                                   i_15 += 2048;
                                                }

                                                if (i_15 < 0 && i_30 > 0 || i_15 > 0 && i_30 < 0) {
                                                   MouseRecorder.field1112 = i_13;
                                                }
                                             }

                                             for (i_5 = 0; i_5 < 5; i_5++) {
                                                ++field904[i_5];
                                             }

                                             class170.field2057.method2105(-2136969712);
                                             i_5 = ++MouseHandler.field480 - 1;
                                             i_7 = class45.field406;
                                             class187 class187_31;
                                             if (i_5 > 15000 && i_7 > 15000) {
                                                field700 = 250;
                                                MouseHandler.field480 = 14500;
                                                class187_31 = class235.method4265(ClientPacketProt.field2300, data.field1313);
                                                data.copy(class187_31);
                                             }

                                             class58.field546.method1762((byte) 9);
                                             ++data.field1319;
                                             if (data.field1319 > 50) {
                                                class187_31 = class235.method4265(ClientPacketProt.field2225, data.field1313);
                                                data.copy(class187_31);
                                             }

                                             try {
                                                data.method2234();
                                             } catch (IOException ioexception_32) {
                                                class56.method1090();
                                             }

                                             return;
                                          }

                                          widget_29 = musicPatchPcmStream_43.field575;
                                          if (widget_29.field2565 < 0) {
                                             break;
                                          }

                                          widget_41 = WorldMapElement.getWidget(widget_29.field2583);
                                       } while (widget_41 == null || widget_41.field2675 == null || widget_29.field2565 >= widget_41.field2675.length || widget_29 != widget_41.field2675[widget_29.field2565]);

                                       class184.method3613(musicPatchPcmStream_43);
                                    }
                                 }

                                 widget_29 = musicPatchPcmStream_43.field575;
                                 if (widget_29.field2565 < 0) {
                                    break;
                                 }

                                 widget_41 = WorldMapElement.getWidget(widget_29.field2583);
                              } while (widget_41 == null || widget_41.field2675 == null || widget_29.field2565 >= widget_41.field2675.length || widget_29 != widget_41.field2675[widget_29.field2565]);

                              class184.method3613(musicPatchPcmStream_43);
                           }
                        }

                        widget_29 = musicPatchPcmStream_43.field575;
                        if (widget_29.field2565 < 0) {
                           break;
                        }

                        widget_41 = WorldMapElement.getWidget(widget_29.field2583);
                     } while (widget_41 == null || widget_41.field2675 == null || widget_29.field2565 >= widget_41.field2675.length || widget_29 != widget_41.field2675[widget_29.field2565]);

                     class184.method3613(musicPatchPcmStream_43);
                  }
               }
            }
         }
      }
   }

   final void pushLoginData() {
      Object obj_2 = data.getSocket();
      PacketBuffer buffer3_3 = data.packetBuffer;

      try {
         if (stateLogin == 0) {
            if (class23.field187 == null && (field692.method2067() || field687 > 250)) {
               class23.field187 = field692.method2057();
               field692.method2064();
               field692 = null;
            }

            if (class23.field187 != null) {
               if (obj_2 != null) {
                  ((AbstractSocket) obj_2).close();
                  obj_2 = null;
               }

               class278.field3628 = null;
               field701 = false;
               field687 = 0;
               stateLogin = 1;
            }
         }

         if (stateLogin == 1) {
            if (class278.field3628 == null) {
               class278.field3628 = GameApplet.field463.method3478(class73.field1068, class90.field1266);
            }

            if (class278.field3628.field2022 == 2) {
               throw new IOException();
            }

            if (class278.field3628.field2022 == 1) {
               if (field815) {
                  obj_2 = class303.method5770((Socket) class278.field3628.field2025, 40000, 5000, (byte) 10);
               } else {
                  obj_2 = new class171((Socket) class278.field3628.field2025, GameApplet.field463, 5000);
               }

               data.method2221((AbstractSocket) obj_2);
               class278.field3628 = null;
               stateLogin = 2;
            }
         }

         if (stateLogin == 2) {
            data.method2218();
            class187 class187_5;
            if (class187.field2336 == 0) {
               class187_5 = new class187();
            } else {
               class187_5 = class187.field2335[--class187.field2336];
            }

            class187_5.field2338 = null;
            class187_5.field2332 = 0;
            class187_5.outBuffer = new PacketBuffer(5000);
            class187_5.outBuffer.writeByte(class184.field2306.field2313);
            data.copy(class187_5);
            data.method2234();
            buffer3_3.position = 0;
            stateLogin = 3;
         }

         boolean bool_15;
         int i_16;
         if (stateLogin == 3) {
            if (WorldMapElement.field1144 != null) {
               WorldMapElement.field1144.method2407();
            }

            if (class190.field2361 != null) {
               class190.field2361.method2407();
            }

            bool_15 = true;
            if (field815 && !((AbstractSocket) obj_2).isAvailable(1)) {
               bool_15 = false;
            }

            if (bool_15) {
               i_16 = ((AbstractSocket) obj_2).vmethod5825((byte) 2);
               if (WorldMapElement.field1144 != null) {
                  WorldMapElement.field1144.method2407();
               }

               if (class190.field2361 != null) {
                  class190.field2361.method2407();
               }

               if (i_16 != 0) {
                  class23.loginResponseAction(i_16);
                  return;
               }

               buffer3_3.position = 0;
               stateLogin = 4;
            }
         }

         int i_31;
         if (stateLogin == 4) {
            if (buffer3_3.position < 8) {
               i_31 = ((AbstractSocket) obj_2).vmethod5826((byte) 55);
               if (i_31 > 8 - buffer3_3.position) {
                  i_31 = 8 - buffer3_3.position;
               }

               if (i_31 > 0) {
                  ((AbstractSocket) obj_2).read(buffer3_3.buffer, buffer3_3.position, i_31);
                  buffer3_3.position += i_31;
               }
            }

            if (buffer3_3.position == 8) {
               buffer3_3.position = 0;
               Entity.field1872 = buffer3_3.readLongFromMediumEndian();
               stateLogin = 5;
            }
         }

         //..Decode Payload
         if (stateLogin == 5) {
            data.packetBuffer.position = 0;
            data.method2218();
            PacketBuffer jagex_rsa_block = new PacketBuffer(500);
            //..Issac encryption
            int[] xtea = new int[]{class23.field187.nextInt(), class23.field187.nextInt(), class23.field187.nextInt(), class23.field187.nextInt()};
            jagex_rsa_block.position = 0;
            //..Block Length
            jagex_rsa_block.writeByte(1);
            //..Issac Keys
            jagex_rsa_block.writeIntBigEndian(xtea[0]);
            jagex_rsa_block.writeIntBigEndian(xtea[1]);
            jagex_rsa_block.writeIntBigEndian(xtea[2]);
            jagex_rsa_block.writeIntBigEndian(xtea[3]);

            System.out.println("writting issac seed 0: " + xtea[0]);
            System.out.println("writting issac seed 1: " + xtea[1]);
            System.out.println("writting issac seed 2: " + xtea[2]);
            System.out.println("writting issac seed 3: " + xtea[3]);

            //..Reported issac seed
            System.out.println("Here writing long big end: " + Entity.field1872);

            jagex_rsa_block.writeLongBigEndian(Entity.field1872);

            if (field662 == 40) {
               System.out.println("Here writing xtea keys i think ");
               //..Unknown
               jagex_rsa_block.writeIntBigEndian(class74.field1074[0]);
               jagex_rsa_block.writeIntBigEndian(class74.field1074[1]);
               jagex_rsa_block.writeIntBigEndian(class74.field1074[2]);
               jagex_rsa_block.writeIntBigEndian(class74.field1074[3]);
            } else {
               //..Authentication type
               jagex_rsa_block.writeByte(authentication.getId());
               //..Switch to auth type
               switch (authentication.auth_type) {
               case 0:
                  jagex_rsa_block.writeIntBigEndian(((Integer) class17.field117.field1067.get(Integer.valueOf(class128.method2971(Login.localUsername)))).intValue());
                  break;
               case 1:
               case 2:
                  jagex_rsa_block.write24BitInt(class9.field65);
                  ++jagex_rsa_block.position;
                  break;
               case 3:
                  jagex_rsa_block.position += 4;
               }

               jagex_rsa_block.writeByte(WorldMapData_1.field3837.getId());
               jagex_rsa_block.writeNullTerminatedString(Login.Login_password);
            }

            //..RSA encoding
            jagex_rsa_block.encryptRSA(class83.field1165, class83.field1162);
            class74.field1074 = xtea;
            class187 class187_7;
            if (class187.field2336 == 0) {
               class187_7 = new class187();
            } else {
               class187_7 = class187.field2335[--class187.field2336];
            }

            class187_7.field2338 = null;
            class187_7.field2332 = 0;
            class187_7.outBuffer = new PacketBuffer(5000);
            class187_7.outBuffer.position = 0;

            if (field662 == 40) {
               class187_7.outBuffer.writeByte(class184.field2311.field2313);
            } else {
               class187_7.outBuffer.writeByte(class184.field2308.field2313);
            }

            class187_7.outBuffer.writeShortBigEndian(0);

            int i_17 = class187_7.outBuffer.position;
            //..Write application revision
            System.out.println("Writing revision: " + (181));
            class187_7.outBuffer.writeIntBigEndian(181); //..Version

            //..Write padding first
            System.out.println("Writing padding first: " + (1));
            class187_7.outBuffer.writeIntBigEndian(1); //..Spacer 1

            //..Write platform
            System.out.println("Writing platform type: " + (platformType));
            class187_7.outBuffer.writeByte(platformType); //..platformType

            //..unknown
            System.out.println("Writing rsa block length/position");
            class187_7.outBuffer.writeBytes(jagex_rsa_block.buffer, 0, jagex_rsa_block.position);

            //..Write username
            int i_9 = class187_7.outBuffer.position;
            //..Write unknown null terminated string
            System.out.println("Writing local username: " + (Login.localUsername));
            class187_7.outBuffer.writeNullTerminatedString(Login.localUsername);

            //..Write unknown byte
            int resizeable = (resizeSettings ? 1 : 0) << 1 | (resizeSettings2 ? 1 : 0);
            System.out.println("Writing resize settings: " + (resizeable));
            class187_7.outBuffer.writeByte(resizeable);

            //..Write client size width
            System.out.println("Writing current client width: " + (class7.clientWidth));
            class187_7.outBuffer.writeShortBigEndian(class7.clientWidth);

            //..Write unknown short
            System.out.println("Writing current client height: " + (ParamComposition.clientHeight));
            class187_7.outBuffer.writeShortBigEndian(ParamComposition.clientHeight);

            PacketBuffer buffer3_10 = class187_7.outBuffer;

            int i_13;
            if (field693 != null) {
               buffer3_10.writeBytes(field693, 0, field693.length);
            } else {
               byte[] bytes_12 = new byte[24];

               try {
                  class167.field2040.method6521(0L);
                  class167.field2040.method6547(bytes_12);

                  for (i_13 = 0; i_13 < 24 && bytes_12[i_13] == 0; i_13++) {
                     ;
                  }

                  if (i_13 >= 24) {
                     throw new IOException();
                  }
               } catch (Exception exception_22) {
                  for (int i_14 = 0; i_14 < 24; i_14++) {
                     bytes_12[i_14] = -1;
                  }
               }

               buffer3_10.writeBytes(bytes_12, 0, bytes_12.length);
            }

            class187_7.outBuffer.writeNullTerminatedString(class294.field3695);
            class187_7.outBuffer.writeIntBigEndian(class239.field3199);
            ByteBuffer class300_11 = new ByteBuffer(class22.field174.method6282());
            class22.field174.method6281(class300_11);
            class187_7.outBuffer.writeBytes(class300_11.buffer, 0, class300_11.buffer.length);
            class187_7.outBuffer.writeByte(platformType);
            class187_7.outBuffer.writeIntBigEndian(0);
            class187_7.outBuffer.writeIntBigEndian(class197.field2405.field3136);
            class187_7.outBuffer.writeIntBigEndian(class167.field2049.field3136);
            class187_7.outBuffer.writeIntBigEndian(SoundSystem.field2544.field3136);
            class187_7.outBuffer.writeIntBigEndian(GCMonitor.field382.field3136);
            class187_7.outBuffer.writeIntBigEndian(class13.field89.field3136);
            class187_7.outBuffer.writeIntBigEndian(WorldMapCacheName.field307.field3136);
            class187_7.outBuffer.writeIntBigEndian(class29.field253.field3136);
            class187_7.outBuffer.writeIntBigEndian(NPCDefinition.field3500.field3136);
            class187_7.outBuffer.writeIntBigEndian(field683.field3136);
            class187_7.outBuffer.writeIntBigEndian(class4.field18.field3136);
            class187_7.outBuffer.writeIntBigEndian(class17.field110.field3136);
            class187_7.outBuffer.writeIntBigEndian(class32.field279.field3136);
            class187_7.outBuffer.writeIntBigEndian(class151.field1971.field3136);
            class187_7.outBuffer.writeIntBigEndian(class2.field6.field3136);
            class187_7.outBuffer.writeIntBigEndian(Tile.field1647.field3136);
            class187_7.outBuffer.writeIntBigEndian(class67.field650.field3136);
            class187_7.outBuffer.writeIntBigEndian(0);
            class187_7.outBuffer.writeIntBigEndian(WorldMapID.field232.field3136);
            class187_7.outBuffer.writeIntBigEndian(field684.field3136);
            class187_7.outBuffer.writeIntBigEndian(ItemDefinition.field3457.field3136);
            class187_7.outBuffer.writeIntBigEndian(Entity.field1874.field3136);
            class187_7.outBuffer.encryptTEA(xtea, i_9, class187_7.outBuffer.position);
            class187_7.outBuffer.writeShortSizeAtOffset(class187_7.outBuffer.position - i_17);
            data.copy(class187_7);
            data.method2234();
            data.field1313 = new IssacSeed(xtea);
            int[] issac = new int[4];

            for (i_13 = 0; i_13 < 4; i_13++) {
               issac[i_13] = xtea[i_13] + 50;
            }

            buffer3_3.method5437(issac);
            stateLogin = 6;
         }

         if (stateLogin == 6 && ((AbstractSocket) obj_2).vmethod5826((byte) 76) > 0) {
            i_31 = ((AbstractSocket) obj_2).vmethod5825((byte) 2);
            if (i_31 == 21 && field662 == 20) {
               stateLogin = 9;
            } else if (i_31 == 2) {
               stateLogin = 11;
            } else if (i_31 == 15 && field662 == 40) {
               data.serverPacketLength = -1;
               stateLogin = 16;
            } else if (i_31 == 64) {
               stateLogin = 7;
            } else if (i_31 == 23 && field688 < 1) {
               ++field688;
               stateLogin = 0;
            } else {
               if (i_31 != 29) {
                  class23.loginResponseAction(i_31);
                  return;
               }

               stateLogin = 14;
            }
         }

         if (stateLogin == 7 && ((AbstractSocket) obj_2).vmethod5826((byte) 120) > 0) {
            class323.field3884 = ((AbstractSocket) obj_2).vmethod5825((byte) 2);
            stateLogin = 8;
         }

         if (stateLogin == 8 && ((AbstractSocket) obj_2).vmethod5826((byte) 95) >= class323.field3884) {
            ((AbstractSocket) obj_2).read(buffer3_3.buffer, 0, class323.field3884);
            buffer3_3.position = 0;
            stateLogin = 6;
         }

         if (stateLogin == 9 && ((AbstractSocket) obj_2).vmethod5826((byte) 56) > 0) {
            field836 = (((AbstractSocket) obj_2).vmethod5825((byte) 2) + 3) * 60;
            stateLogin = 10;
         }

         if (stateLogin == 10) {
            field687 = 0;
            class268.loginResponseMessages("You have only just left another world.", "Your profile will be transferred in:", field836 / 60 + " seconds.");
            if (--field836 <= 0) {
               stateLogin = 0;
            }

         } else {
            if (stateLogin == 11 && ((AbstractSocket) obj_2).vmethod5826((byte) 85) >= 1) {
               class251.field3324 = ((AbstractSocket) obj_2).vmethod5825((byte) 2);
               stateLogin = 12;
            }

            if (stateLogin == 12 && ((AbstractSocket) obj_2).vmethod5826((byte) 57) >= class251.field3324) {
               bool_15 = ((AbstractSocket) obj_2).vmethod5825((byte) 2) == 1;
               ((AbstractSocket) obj_2).read(buffer3_3.buffer, 0, 4);
               buffer3_3.position = 0;
               boolean bool_32 = false;
               if (bool_15) {
                  i_16 = buffer3_3.method5440() << 24;
                  i_16 |= buffer3_3.method5440() << 16;
                  i_16 |= buffer3_3.method5440() << 8;
                  i_16 |= buffer3_3.method5440();
                  int i_19 = class128.method2971(Login.localUsername);
                  if (class17.field117.field1067.size() >= 10 && !class17.field117.field1067.containsKey(Integer.valueOf(i_19))) {
                     Iterator iterator_29 = class17.field117.field1067.entrySet().iterator();
                     iterator_29.next();
                     iterator_29.remove();
                  }

                  class17.field117.field1067.put(Integer.valueOf(i_19), Integer.valueOf(i_16));
               }

               if (field691) {
                  class17.field117.field1065 = Login.localUsername;
               } else {
                  class17.field117.field1065 = null;
               }

               class97.method2268();
               localRights = ((AbstractSocket) obj_2).vmethod5825((byte) 2);
               field826 = ((AbstractSocket) obj_2).vmethod5825((byte) 2) == 1;
               field770 = ((AbstractSocket) obj_2).vmethod5825((byte) 2);
               field770 <<= 8;
               field770 += ((AbstractSocket) obj_2).vmethod5825((byte) 2);
               field771 = ((AbstractSocket) obj_2).vmethod5825((byte) 2);
               ((AbstractSocket) obj_2).read(buffer3_3.buffer, 0, 1);
               buffer3_3.position = 0;
               ServerPacketProt[] arr_6 = MouseRecorder.packetValues();
               int i_20 = buffer3_3.readSmartByteShortIsaac();
               if (i_20 < 0 || i_20 >= arr_6.length) {
                  throw new IOException(i_20 + " " + buffer3_3.position);
               }

               data.serverPacket = arr_6[i_20];
               data.serverPacketLength = data.serverPacket.length;
               ((AbstractSocket) obj_2).read(buffer3_3.buffer, 0, 2);
               buffer3_3.position = 0;
               data.serverPacketLength = buffer3_3.readUnsignedShort();

               try {
                  Client client_8 = WorldMapID.client;
                  JSObject.getWindow(client_8).call("zap", (Object[]) null);
               } catch (Throwable throwable_21) {
                  ;
               }

               stateLogin = 13;
            }

            if (stateLogin == 13) {
               if (((AbstractSocket) obj_2).vmethod5826((byte) 73) >= data.serverPacketLength) {
                  buffer3_3.position = 0;
                  ((AbstractSocket) obj_2).read(buffer3_3.buffer, 0, data.serverPacketLength);
                  timer.method5014();
                  class137.method3264(-1702335616);
                  class20.method238(buffer3_3, (byte) -61);
                  class48.field418 = -1;
                  class55.method1084(false, buffer3_3);
                  data.serverPacket = null;
               }

            } else {
               if (stateLogin == 14 && ((AbstractSocket) obj_2).vmethod5826((byte) 115) >= 2) {
                  buffer3_3.position = 0;
                  ((AbstractSocket) obj_2).read(buffer3_3.buffer, 0, 2);
                  buffer3_3.position = 0;
                  class21.field155 = buffer3_3.readUnsignedShort();
                  stateLogin = 15;
               }

               if (stateLogin == 15 && ((AbstractSocket) obj_2).vmethod5826((byte) 25) >= class21.field155) {
                  buffer3_3.position = 0;
                  ((AbstractSocket) obj_2).read(buffer3_3.buffer, 0, class21.field155);
                  buffer3_3.position = 0;
                  String string_24 = buffer3_3.readNullTerminatedString();
                  String string_26 = buffer3_3.readNullTerminatedString();
                  String string_27 = buffer3_3.readNullTerminatedString();
                  class268.loginResponseMessages(string_24, string_26, string_27);
                  class96.updateGameState(10);
               }

               if (stateLogin != 16) {
                  ++field687;
                  if (field687 > 2000) {
                     if (field688 < 1) {
                        if (class190.field2358 == class90.field1266) {
                           class90.field1266 = class132.field1800;
                        } else {
                           class90.field1266 = class190.field2358;
                        }

                        ++field688;
                        stateLogin = 0;
                     } else {
                        class23.loginResponseAction(-3);
                     }
                  }
               } else {
                  if (data.serverPacketLength == -1) {
                     if (((AbstractSocket) obj_2).vmethod5826((byte) 119) < 2) {
                        return;
                     }

                     ((AbstractSocket) obj_2).read(buffer3_3.buffer, 0, 2);
                     buffer3_3.position = 0;
                     data.serverPacketLength = buffer3_3.readUnsignedShort();
                  }

                  if (((AbstractSocket) obj_2).vmethod5826((byte) 65) >= data.serverPacketLength) {
                     ((AbstractSocket) obj_2).read(buffer3_3.buffer, 0, data.serverPacketLength);
                     buffer3_3.position = 0;
                     i_31 = data.serverPacketLength;
                     timer.method5000();
                     data.method2218();
                     data.packetBuffer.position = 0;
                     data.serverPacket = null;
                     data.field1309 = null;
                     data.field1321 = null;
                     data.field1317 = null;
                     data.serverPacketLength = 0;
                     data.field1318 = 0;
                     field669 = 0;
                     Widget2.method4121();
                     minimapState = 0;
                     destinationX = 0;

                     for (i_16 = 0; i_16 < 2048; i_16++) {
                        field909[i_16] = null;
                     }

                     localPlayer = null;

                     for (i_16 = 0; i_16 < npcs.length; i_16++) {
                        NPC NPC_28 = npcs[i_16];
                        if (NPC_28 != null) {
                           NPC_28.field975 = -1;
                           NPC_28.field964 = false;
                        }
                     }

                     class59.field552 = new class318(32);
                     class96.updateGameState(30);

                     for (i_16 = 0; i_16 < 100; i_16++) {
                        field843[i_16] = true;
                     }

                     class70.writeOutgoingWindowMode();
                     class20.method238(buffer3_3, (byte) 109);
                     if (i_31 != buffer3_3.position) {
                        throw new RuntimeException();
                     }
                  }
               }
            }
         }
      } catch (IOException ioexception_23) {
         if (field688 < 1) {
            if (class90.field1266 == class190.field2358) {
               class90.field1266 = class132.field1800;
            } else {
               class90.field1266 = class190.field2358;
            }

            ++field688;
            stateLogin = 0;
         } else {
            class23.loginResponseAction(-2);
         }
      }
   }

   final void method1333() {
      boolean bool_2 = false;

      int i_3;
      int i_6;
      while (!bool_2) {
         bool_2 = true;

         for (i_3 = 0; i_3 < menuOptionsCount - 1; i_3++) {
            if (menuOpcodes[i_3] < 1000 && menuOpcodes[i_3 + 1] > 1000) {
               String string_4 = field668[i_3];
               field668[i_3] = field668[i_3 + 1];
               field668[i_3 + 1] = string_4;
               String string_5 = field796[i_3];
               field796[i_3] = field796[i_3 + 1];
               field796[i_3 + 1] = string_5;
               i_6 = menuOpcodes[i_3];
               menuOpcodes[i_3] = menuOpcodes[i_3 + 1];
               menuOpcodes[i_3 + 1] = i_6;
               i_6 = field792[i_3];
               field792[i_3] = field792[i_3 + 1];
               field792[i_3 + 1] = i_6;
               i_6 = field793[i_3];
               field793[i_3] = field793[i_3 + 1];
               field793[i_3 + 1] = i_6;
               i_6 = field795[i_3];
               field795[i_3] = field795[i_3 + 1];
               field795[i_3 + 1] = i_6;
               boolean bool_7 = field769[i_3];
               field769[i_3] = field769[i_3 + 1];
               field769[i_3 + 1] = bool_7;
               bool_2 = false;
            }
         }
      }

      if (Buffer.field127 == null) {
         if (field828 == null) {
            int i_21 = MouseHandler.field493;
            int i_9;
            int i_10;
            int i_11;
            int i_15;
            int i_16;
            int i_22;
            if (field674) {
               if (i_21 != 1 && (class46.field413 || i_21 != 4)) {
                  i_3 = MouseHandler.MouseHandler_x;
                  i_15 = MouseHandler.MouseHandler_y;
                  if (i_3 < class247.field3292 - 10 || i_3 > class247.field3292 + WorldMapRectangle.field373 + 10 || i_15 < class30.field267 - 10 || i_15 > class30.field267 + class75.field1092 + 10) {
                     field674 = false;
                     UserComparator10.method2215(class247.field3292, class30.field267, WorldMapRectangle.field373, class75.field1092);
                  }
               }

               if (i_21 == 1 || !class46.field413 && i_21 == 4) {
                  i_3 = class247.field3292;
                  i_15 = class30.field267;
                  i_16 = WorldMapRectangle.field373;
                  i_6 = MouseHandler.field483;
                  i_22 = MouseHandler.field495;
                  int i_23 = -1;

                  for (i_9 = 0; i_9 < menuOptionsCount; i_9++) {
                     i_10 = (menuOptionsCount - 1 - i_9) * 15 + i_15 + 31;
                     if (i_6 > i_3 && i_6 < i_16 + i_3 && i_22 > i_10 - 13 && i_22 < i_10 + 3) {
                        i_23 = i_9;
                     }
                  }

                  if (i_23 != -1 && i_23 >= 0) {
                     i_9 = field792[i_23];
                     i_10 = field793[i_23];
                     i_11 = menuOpcodes[i_23];
                     int i_20 = field795[i_23];
                     String string_13 = field796[i_23];
                     String string_14 = field668[i_23];
                     class91.writeSomePacket(i_9, i_10, i_11, i_20, string_14, MouseHandler.field483, MouseHandler.field495);
                  }

                  field674 = false;
                  UserComparator10.method2215(class247.field3292, class30.field267, WorldMapRectangle.field373, class75.field1092);
               }
            } else {
               label281: {
                  i_3 = class13.getNewestMenuIdx();
                  if ((i_21 == 1 || !class46.field413 && i_21 == 4) && i_3 >= 0) {
                     i_15 = menuOpcodes[i_3];
                     if (i_15 == 39 || i_15 == 40 || i_15 == 41 || i_15 == 42 || i_15 == 43 || i_15 == 33 || i_15 == 34 || i_15 == 35 || i_15 == 36 || i_15 == 37 || i_15 == 38 || i_15 == 1005) {
                        i_16 = field792[i_3];
                        i_6 = field793[i_3];
                        Widget widget_17 = WorldMapElement.getWidget(i_6);
                        i_9 = class268.method4987(widget_17);
                        boolean bool_8 = (i_9 >> 28 & 0x1) != 0;
                        if (bool_8) {
                           break label281;
                        }

                        Object obj_10000 = null;
                        if (class151.method3382(class268.method4987(widget_17), 1663447134)) {
                           break label281;
                        }
                     }
                  }

                  if ((i_21 == 1 || !class46.field413 && i_21 == 4) && this.method1257()) {
                     i_21 = 2;
                  }

                  if ((i_21 == 1 || !class46.field413 && i_21 == 4) && menuOptionsCount > 0 && i_3 >= 0) {
                     i_15 = field792[i_3];
                     i_16 = field793[i_3];
                     i_6 = menuOpcodes[i_3];
                     i_22 = field795[i_3];
                     String string_18 = field796[i_3];
                     String string_19 = field668[i_3];
                     class91.writeSomePacket(i_15, i_16, i_6, i_22, string_19, MouseHandler.field483, MouseHandler.field495);
                  }

                  if (i_21 == 2 && menuOptionsCount > 0) {
                     this.method1274(MouseHandler.field483, MouseHandler.field495);
                  }

                  return;
               }

               if (Buffer.field127 != null && !field874 && menuOptionsCount > 0 && !this.method1257()) {
                  i_10 = field654;
                  i_11 = field763;
                  class82 class82_12 = field916;
                  class91.writeSomePacket(class82_12.field1157, class82_12.field1156, class82_12.field1155, class82_12.field1158, class82_12.field1159, i_10, i_11);
                  field916 = null;
               }

               field874 = false;
               field766 = 0;
               if (Buffer.field127 != null) {
                  Widget2.invalidateWidget(Buffer.field127);
               }

               Buffer.field127 = WorldMapElement.getWidget(i_6);
               field765 = i_16;
               field654 = MouseHandler.field483;
               field763 = MouseHandler.field495;
               if (i_3 >= 0) {
                  class112.method2510(i_3);
               }

               Widget2.invalidateWidget(Buffer.field127);
               return;
            }

         }
      }
   }

   void method1260(Widget widget_1) {
      Widget widget_3 = widget_1.field2583 == -1 ? null : WorldMapElement.getWidget(widget_1.field2583);
      int i_4;
      int i_5;
      if (widget_3 == null) {
         i_4 = class7.clientWidth;
         i_5 = ParamComposition.clientHeight;
      } else {
         i_4 = widget_3.field2579;
         i_5 = widget_3.field2667;
      }

      class219.method4112(widget_1, i_4, i_5, false);
      ResourceHandler.method2441(widget_1, i_4, i_5);
   }

   final void method1641() {
      Widget2.invalidateWidget(field828);
      ++WorldMapElement.field1143;
      if (field745 && field873) {
         int i_2 = MouseHandler.MouseHandler_x;
         int i_3 = MouseHandler.MouseHandler_y;
         i_2 -= field830;
         i_3 -= field831;
         if (i_2 < field834) {
            i_2 = field834;
         }

         if (i_2 + field828.field2579 > field834 + field829.field2579) {
            i_2 = field834 + field829.field2579 - field828.field2579;
         }

         if (i_3 < field835) {
            i_3 = field835;
         }

         if (i_3 + field828.field2667 > field835 + field829.field2667) {
            i_3 = field835 + field829.field2667 - field828.field2667;
         }

         int i_4 = i_2 - field837;
         int i_5 = i_3 - field838;
         int i_6 = field828.field2646;
         if (WorldMapElement.field1143 > field828.field2647 && (i_4 > i_6 || i_4 < -i_6 || i_5 > i_6 || i_5 < -i_6)) {
            field839 = true;
         }

         int i_7 = i_2 - field834 + field829.field2585;
         int i_8 = i_3 - field835 + field829.field2586;
         MusicPatchPcmStream musicPatchPcmStream_9;
         if (field828.field2620 != null && field839) {
            musicPatchPcmStream_9 = new MusicPatchPcmStream();
            musicPatchPcmStream_9.field575 = field828;
            musicPatchPcmStream_9.field576 = i_7;
            musicPatchPcmStream_9.field577 = i_8;
            musicPatchPcmStream_9.field581 = field828.field2620;
            class184.method3613(musicPatchPcmStream_9);
         }

         if (MouseHandler.field485 == 0) {
            if (field839) {
               if (field828.field2660 != null) {
                  musicPatchPcmStream_9 = new MusicPatchPcmStream();
                  musicPatchPcmStream_9.field575 = field828;
                  musicPatchPcmStream_9.field576 = i_7;
                  musicPatchPcmStream_9.field577 = i_8;
                  musicPatchPcmStream_9.field579 = field832;
                  musicPatchPcmStream_9.field581 = field828.field2660;
                  class184.method3613(musicPatchPcmStream_9);
               }

               if (field832 != null) {
                  Widget widget_10 = field828;
                  int i_11 = class32.method545(class268.method4987(widget_10));
                  Widget widget_16;
                  if (i_11 == 0) {
                     widget_16 = null;
                  } else {
                     int i_12 = 0;

                     while (true) {
                        if (i_12 >= i_11) {
                           widget_16 = widget_10;
                           break;
                        }

                        widget_10 = WorldMapElement.getWidget(widget_10.field2583);
                        if (widget_10 == null) {
                           widget_16 = null;
                           break;
                        }

                        ++i_12;
                     }
                  }

                  if (widget_16 != null) {
                     class187 class187_17 = class235.method4265(ClientPacketProt.IF_ITEM_DRAG, data.field1313);
                     class187_17.outBuffer.writeUnsignedShortA(field828.field2565);
                     class187_17.outBuffer.writeUnsignedShortA(field832.field2690);
                     class187_17.outBuffer.writeShortBigEndian(field832.field2565);
                     class187_17.outBuffer.writeIntLittleEndian(field828.field2688);
                     class187_17.outBuffer.writeIntReversed(field832.field2688);
                     class187_17.outBuffer.writeShortBigEndian(field828.field2690);
                     data.copy(class187_17);
                  }
               }
            } else if (this.method1257()) {
               this.method1274(field830 + field837, field831 + field838);
            } else if (menuOptionsCount > 0) {
               int i_14 = field830 + field837;
               int i_15 = field838 + field831;
               class82 class82_13 = field916;
               class91.writeSomePacket(class82_13.field1157, class82_13.field1156, class82_13.field1155, class82_13.field1158, class82_13.field1159, i_14, i_15);
               field916 = null;
            }

            field828 = null;
         }

      } else {
         if (WorldMapElement.field1143 > 1) {
            field828 = null;
         }

      }
   }

   public final void init() {
      if (this.getHost()) {
         class271[] arr_1 = class137.method3265();

         for (int i_2 = 0; i_2 < arr_1.length; i_2++) {
            class271 class271_3 = arr_1[i_2];
            String string_4 = this.getParameter(class271_3.field3597);
            if (string_4 != null) {
               switch(Integer.parseInt(class271_3.field3597)) {
               case 1:
                  field815 = Integer.parseInt(string_4) != 0;
               case 2:
               case 11:
               case 13:
               case 16:
               default:
                  break;
               case 3:
                  if (string_4.equalsIgnoreCase("true")) {
                     field655 = true;
                  } else {
                     field655 = false;
                  }
                  break;
               case 4:
                  if (platformType == -1) {
                     platformType = Integer.parseInt(string_4);
                  }
                  break;
               case 5:
                  field653 = Integer.parseInt(string_4);
                  break;
               case 6:
                  int i_6 = Integer.parseInt(string_4);
                  class190 class190_10;
                  if (i_6 >= 0 && i_6 < class190.field2355.length) {
                     class190_10 = class190.field2355[i_6];
                  } else {
                     class190_10 = null;
                  }

                  class56.field528 = class190_10;
                  break;
               case 7:
                  class187.field2337 = class229.method4133(Integer.parseInt(string_4));
                  break;
               case 8:
                  if (string_4.equalsIgnoreCase("true")) {
                     ;
                  }
                  break;
               case 9:
                  class294.field3695 = string_4;
                  break;
               case 10:
                  class230[] arr_5 = new class230[] {class230.field3110, class230.field3107, class230.field3109, class230.field3106, class230.field3108, class230.field3112};
                  class29.field248 = (class230) MemoryManager.findById(arr_5, Integer.parseInt(string_4));
                  if (class29.field248 == class230.field3110) {
                     FontName.loginType = class338.field4052;
                  } else {
                     FontName.loginType = class338.field4056;
                  }
                  break;
               case 12:
                  field807 = Integer.parseInt(string_4);
                  break;
               case 14:
                  class239.field3199 = Integer.parseInt(string_4);
                  break;
               case 15:
                  field703 = Integer.parseInt(string_4);
                  break;
               case 17:
                  item.field213 = string_4;
               }
            }
         }

         SoundSystem.method4022();
         class73.field1068 = this.getCodeBase().getHost();
         String string_8 = class187.field2337.field3100;
         byte b_9 = 0;

         try {
            class159.method3440("oldschool", string_8, b_9, 21);
         } catch (Exception exception_7) {
            ErrorHandler.logError(null, exception_7);
         }

         WorldMapID.client = this;
         GZipDecompressor.field4066 = platformType;
         this.startThread(765, 503, 181);
      }
   }

}
