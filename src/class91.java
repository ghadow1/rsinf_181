import java.util.HashMap;
import java.util.Map;

public class class91 {

   public static class233 field1276;
   static final Map field1279 = new HashMap();
   static final class316 field1277 = new class316(1024);
   static final class265 field1278 = new class265();
   static int field1282 = 0;

   static final void method2170(int i_0, int i_1, int i_2, int i_3, String string_4, String string_5, int i_6, int i_7, int i_8) {
      if (i_2 >= 2000) {
         i_2 -= 2000;
      }

      class187 class187_9;
      if (i_2 == 1) {
         Client.field876 = i_6;
         Client.field755 = i_7;
         Client.field757 = 2;
         Client.field756 = 0;
         Client.field885 = i_0;
         Client.field842 = i_1;
         class187_9 = class235.method4265(ClientPacketProt.field2247, Client.data.field1313);
         class187_9.outBuffer.writeShortWithOffset(class1.field1 + i_1);
         class187_9.outBuffer.writeShortLittleEndian(class23.field182);
         class187_9.outBuffer.writeOffsetByte(class45.field395[82] ? 1 : 0);
         class187_9.outBuffer.writeIntLittleEndian(class63.field594);
         class187_9.outBuffer.writeShortWithOffset(i_0 + class196.field2389);
         class187_9.outBuffer.writeShortBigEndian(i_3);
         class187_9.outBuffer.writeShortLittleEndian(class4.field19);
         Client.data.copy(class187_9);
      } else if (i_2 == 2) {
         Client.field876 = i_6;
         Client.field755 = i_7;
         Client.field757 = 2;
         Client.field756 = 0;
         Client.field885 = i_0;
         Client.field842 = i_1;
         class187_9 = class235.method4265(ClientPacketProt.field2295, Client.data.field1313);
         class187_9.outBuffer.writeByte(class45.field395[82] ? 1 : 0);
         class187_9.outBuffer.writeShortBigEndian(i_0 + class196.field2389);
         class187_9.outBuffer.writeShortWithOffset2(i_3);
         class187_9.outBuffer.writeIntCustomOrder(class41.field359);
         class187_9.outBuffer.writeShortBigEndian(Client.field848);
         class187_9.outBuffer.writeShortLittleEndian(class1.field1 + i_1);
         Client.data.copy(class187_9);
      } else if (i_2 == 3) {
         Client.field876 = i_6;
         Client.field755 = i_7;
         Client.field757 = 2;
         Client.field756 = 0;
         Client.field885 = i_0;
         Client.field842 = i_1;
         class187_9 = class235.method4265(ClientPacketProt.field2213, Client.data.field1313);
         class187_9.outBuffer.writeShortBigEndian(class1.field1 + i_1);
         class187_9.outBuffer.writeInvertedByte(class45.field395[82] ? 1 : 0);
         class187_9.outBuffer.writeShortWithOffset2(i_3);
         class187_9.outBuffer.writeShortWithOffset(i_0 + class196.field2389);
         Client.data.copy(class187_9);
      } else if (i_2 == 4) {
         Client.field876 = i_6;
         Client.field755 = i_7;
         Client.field757 = 2;
         Client.field756 = 0;
         Client.field885 = i_0;
         Client.field842 = i_1;
         class187_9 = class235.method4265(ClientPacketProt.field2282, Client.data.field1313);
         class187_9.outBuffer.writeOffsetByte(class45.field395[82] ? 1 : 0);
         class187_9.outBuffer.writeShortBigEndian(i_3);
         class187_9.outBuffer.writeShortBigEndian(class1.field1 + i_1);
         class187_9.outBuffer.writeShortBigEndian(i_0 + class196.field2389);
         Client.data.copy(class187_9);
      } else if (i_2 == 5) {
         Client.field876 = i_6;
         Client.field755 = i_7;
         Client.field757 = 2;
         Client.field756 = 0;
         Client.field885 = i_0;
         Client.field842 = i_1;
         class187_9 = class235.method4265(ClientPacketProt.field2292, Client.data.field1313);
         class187_9.outBuffer.writeShortWithOffset(i_0 + class196.field2389);
         class187_9.outBuffer.writeShortWithOffset2(i_3);
         class187_9.outBuffer.writeShortWithOffset(class1.field1 + i_1);
         class187_9.outBuffer.writeOffsetByte(class45.field395[82] ? 1 : 0);
         Client.data.copy(class187_9);
      } else if (i_2 == 6) {
         Client.field876 = i_6;
         Client.field755 = i_7;
         Client.field757 = 2;
         Client.field756 = 0;
         Client.field885 = i_0;
         Client.field842 = i_1;
         class187_9 = class235.method4265(ClientPacketProt.field2259, Client.data.field1313);
         class187_9.outBuffer.writeOffsetByte(class45.field395[82] ? 1 : 0);
         class187_9.outBuffer.writeShortWithOffset2(class1.field1 + i_1);
         class187_9.outBuffer.writeShortWithOffset2(i_0 + class196.field2389);
         class187_9.outBuffer.writeShortLittleEndian(i_3);
         Client.data.copy(class187_9);
      } else {
         class187 class187_10;
         class79 class79_14;
         if (i_2 == 7) {
            class79_14 = Client.field694[i_3];
            if (class79_14 != null) {
               Client.field876 = i_6;
               Client.field755 = i_7;
               Client.field757 = 2;
               Client.field756 = 0;
               Client.field885 = i_0;
               Client.field842 = i_1;
               class187_10 = class235.method4265(ClientPacketProt.field2207, Client.data.field1313);
               class187_10.outBuffer.writeShortWithOffset(class4.field19);
               class187_10.outBuffer.writeShortBigEndian(class23.field182);
               class187_10.outBuffer.writeShortWithOffset(i_3);
               class187_10.outBuffer.writeNegatedByte(class45.field395[82] ? 1 : 0);
               class187_10.outBuffer.writeIntBigEndian(class63.field594);
               Client.data.copy(class187_10);
            }
         } else if (i_2 == 8) {
            class79_14 = Client.field694[i_3];
            if (class79_14 != null) {
               Client.field876 = i_6;
               Client.field755 = i_7;
               Client.field757 = 2;
               Client.field756 = 0;
               Client.field885 = i_0;
               Client.field842 = i_1;
               class187_10 = class235.method4265(ClientPacketProt.field2304, Client.data.field1313);
               class187_10.outBuffer.writeShortWithOffset(i_3);
               class187_10.outBuffer.writeNegatedByte(class45.field395[82] ? 1 : 0);
               class187_10.outBuffer.writeIntLittleEndian(class41.field359);
               class187_10.outBuffer.writeShortWithOffset2(Client.field848);
               Client.data.copy(class187_10);
            }
         } else if (i_2 == 9) {
            class79_14 = Client.field694[i_3];
            if (class79_14 != null) {
               Client.field876 = i_6;
               Client.field755 = i_7;
               Client.field757 = 2;
               Client.field756 = 0;
               Client.field885 = i_0;
               Client.field842 = i_1;
               class187_10 = class235.method4265(ClientPacketProt.field2274, Client.data.field1313);
               class187_10.outBuffer.writeNegatedByte(class45.field395[82] ? 1 : 0);
               class187_10.outBuffer.writeShortLittleEndian(i_3);
               Client.data.copy(class187_10);
            }
         } else if (i_2 == 10) {
            class79_14 = Client.field694[i_3];
            if (class79_14 != null) {
               Client.field876 = i_6;
               Client.field755 = i_7;
               Client.field757 = 2;
               Client.field756 = 0;
               Client.field885 = i_0;
               Client.field842 = i_1;
               class187_10 = class235.method4265(ClientPacketProt.field2204, Client.data.field1313);
               class187_10.outBuffer.writeShortWithOffset2(i_3);
               class187_10.outBuffer.writeByte(class45.field395[82] ? 1 : 0);
               Client.data.copy(class187_10);
            }
         } else if (i_2 == 11) {
            class79_14 = Client.field694[i_3];
            if (class79_14 != null) {
               Client.field876 = i_6;
               Client.field755 = i_7;
               Client.field757 = 2;
               Client.field756 = 0;
               Client.field885 = i_0;
               Client.field842 = i_1;
               class187_10 = class235.method4265(ClientPacketProt.field2254, Client.data.field1313);
               class187_10.outBuffer.writeShortWithOffset(i_3);
               class187_10.outBuffer.writeByte(class45.field395[82] ? 1 : 0);
               Client.data.copy(class187_10);
            }
         } else if (i_2 == 12) {
            class79_14 = Client.field694[i_3];
            if (class79_14 != null) {
               Client.field876 = i_6;
               Client.field755 = i_7;
               Client.field757 = 2;
               Client.field756 = 0;
               Client.field885 = i_0;
               Client.field842 = i_1;
               class187_10 = class235.method4265(ClientPacketProt.field2303, Client.data.field1313);
               class187_10.outBuffer.writeShortBigEndian(i_3);
               class187_10.outBuffer.writeOffsetByte(class45.field395[82] ? 1 : 0);
               Client.data.copy(class187_10);
            }
         } else if (i_2 == 13) {
            class79_14 = Client.field694[i_3];
            if (class79_14 != null) {
               Client.field876 = i_6;
               Client.field755 = i_7;
               Client.field757 = 2;
               Client.field756 = 0;
               Client.field885 = i_0;
               Client.field842 = i_1;
               class187_10 = class235.method4265(ClientPacketProt.field2214, Client.data.field1313);
               class187_10.outBuffer.writeByte(class45.field395[82] ? 1 : 0);
               class187_10.outBuffer.writeShortWithOffset2(i_3);
               Client.data.copy(class187_10);
            }
         } else {
            class66 class66_16;
            if (i_2 == 14) {
               class66_16 = Client.field909[i_3];
               if (class66_16 != null) {
                  Client.field876 = i_6;
                  Client.field755 = i_7;
                  Client.field757 = 2;
                  Client.field756 = 0;
                  Client.field885 = i_0;
                  Client.field842 = i_1;
                  class187_10 = class235.method4265(ClientPacketProt.field2284, Client.data.field1313);
                  class187_10.outBuffer.writeShortWithOffset(class23.field182);
                  class187_10.outBuffer.writeInvertedByte(class45.field395[82] ? 1 : 0);
                  class187_10.outBuffer.writeIntReversed(class63.field594);
                  class187_10.outBuffer.writeShortBigEndian(i_3);
                  class187_10.outBuffer.writeShortBigEndian(class4.field19);
                  Client.data.copy(class187_10);
               }
            } else if (i_2 == 15) {
               class66_16 = Client.field909[i_3];
               if (class66_16 != null) {
                  Client.field876 = i_6;
                  Client.field755 = i_7;
                  Client.field757 = 2;
                  Client.field756 = 0;
                  Client.field885 = i_0;
                  Client.field842 = i_1;
                  class187_10 = class235.method4265(ClientPacketProt.field2277, Client.data.field1313);
                  class187_10.outBuffer.writeIntCustomOrder(class41.field359);
                  class187_10.outBuffer.writeInvertedByte(class45.field395[82] ? 1 : 0);
                  class187_10.outBuffer.writeShortWithOffset2(Client.field848);
                  class187_10.outBuffer.writeShortBigEndian(i_3);
                  Client.data.copy(class187_10);
               }
            } else if (i_2 == 16) {
               Client.field876 = i_6;
               Client.field755 = i_7;
               Client.field757 = 2;
               Client.field756 = 0;
               Client.field885 = i_0;
               Client.field842 = i_1;
               class187_9 = class235.method4265(ClientPacketProt.field2221, Client.data.field1313);
               class187_9.outBuffer.writeIntReversed(class63.field594);
               class187_9.outBuffer.writeShortWithOffset(class4.field19);
               class187_9.outBuffer.writeOffsetByte(class45.field395[82] ? 1 : 0);
               class187_9.outBuffer.writeShortLittleEndian(class23.field182);
               class187_9.outBuffer.writeShortWithOffset(i_3);
               class187_9.outBuffer.writeShortWithOffset(i_0 + class196.field2389);
               class187_9.outBuffer.writeShortLittleEndian(class1.field1 + i_1);
               Client.data.copy(class187_9);
            } else if (i_2 == 17) {
               Client.field876 = i_6;
               Client.field755 = i_7;
               Client.field757 = 2;
               Client.field756 = 0;
               Client.field885 = i_0;
               Client.field842 = i_1;
               class187_9 = class235.method4265(ClientPacketProt.field2293, Client.data.field1313);
               class187_9.outBuffer.writeIntReversed(class41.field359);
               class187_9.outBuffer.writeShortBigEndian(Client.field848);
               class187_9.outBuffer.writeShortWithOffset2(class1.field1 + i_1);
               class187_9.outBuffer.writeShortWithOffset2(i_0 + class196.field2389);
               class187_9.outBuffer.writeOffsetByte(class45.field395[82] ? 1 : 0);
               class187_9.outBuffer.writeShortLittleEndian(i_3);
               Client.data.copy(class187_9);
            } else if (i_2 == 18) {
               Client.field876 = i_6;
               Client.field755 = i_7;
               Client.field757 = 2;
               Client.field756 = 0;
               Client.field885 = i_0;
               Client.field842 = i_1;
               class187_9 = class235.method4265(ClientPacketProt.field2208, Client.data.field1313);
               class187_9.outBuffer.writeShortWithOffset(class1.field1 + i_1);
               class187_9.outBuffer.writeShortLittleEndian(i_3);
               class187_9.outBuffer.writeShortLittleEndian(i_0 + class196.field2389);
               class187_9.outBuffer.writeByte(class45.field395[82] ? 1 : 0);
               Client.data.copy(class187_9);
            } else if (i_2 == 19) {
               Client.field876 = i_6;
               Client.field755 = i_7;
               Client.field757 = 2;
               Client.field756 = 0;
               Client.field885 = i_0;
               Client.field842 = i_1;
               class187_9 = class235.method4265(ClientPacketProt.field2256, Client.data.field1313);
               class187_9.outBuffer.writeShortWithOffset(i_3);
               class187_9.outBuffer.writeShortWithOffset2(i_0 + class196.field2389);
               class187_9.outBuffer.writeShortBigEndian(class1.field1 + i_1);
               class187_9.outBuffer.writeByte(class45.field395[82] ? 1 : 0);
               Client.data.copy(class187_9);
            } else if (i_2 == 20) {
               Client.field876 = i_6;
               Client.field755 = i_7;
               Client.field757 = 2;
               Client.field756 = 0;
               Client.field885 = i_0;
               Client.field842 = i_1;
               class187_9 = class235.method4265(ClientPacketProt.field2269, Client.data.field1313);
               class187_9.outBuffer.writeShortLittleEndian(class1.field1 + i_1);
               class187_9.outBuffer.writeInvertedByte(class45.field395[82] ? 1 : 0);
               class187_9.outBuffer.writeShortLittleEndian(i_0 + class196.field2389);
               class187_9.outBuffer.writeShortLittleEndian(i_3);
               Client.data.copy(class187_9);
            } else if (i_2 == 21) {
               Client.field876 = i_6;
               Client.field755 = i_7;
               Client.field757 = 2;
               Client.field756 = 0;
               Client.field885 = i_0;
               Client.field842 = i_1;
               class187_9 = class235.method4265(ClientPacketProt.field2203, Client.data.field1313);
               class187_9.outBuffer.writeShortWithOffset2(class1.field1 + i_1);
               class187_9.outBuffer.writeShortLittleEndian(i_3);
               class187_9.outBuffer.writeShortBigEndian(i_0 + class196.field2389);
               class187_9.outBuffer.writeInvertedByte(class45.field395[82] ? 1 : 0);
               Client.data.copy(class187_9);
            } else if (i_2 == 22) {
               Client.field876 = i_6;
               Client.field755 = i_7;
               Client.field757 = 2;
               Client.field756 = 0;
               Client.field885 = i_0;
               Client.field842 = i_1;
               class187_9 = class235.method4265(ClientPacketProt.field2218, Client.data.field1313);
               class187_9.outBuffer.writeByte(class45.field395[82] ? 1 : 0);
               class187_9.outBuffer.writeShortWithOffset(i_3);
               class187_9.outBuffer.writeShortWithOffset2(class1.field1 + i_1);
               class187_9.outBuffer.writeShortBigEndian(i_0 + class196.field2389);
               Client.data.copy(class187_9);
            } else if (i_2 == 23) {
               if (Client.field674) {
                  class5.field22.method3104();
               } else {
                  class5.field22.method3103(class42.field372, i_0, i_1, true);
               }
            } else {
               class187 class187_11;
               Widget widget_17;
               if (i_2 == 24) {
                  widget_17 = WorldMapElement.getWidget(i_1);
                  boolean bool_13 = true;
                  if (widget_17.field2568 > 0) {
                     bool_13 = HealthBarUpdate.method149(widget_17);
                  }

                  if (bool_13) {
                     class187_11 = class235.method4265(ClientPacketProt.field2272, Client.data.field1313);
                     class187_11.outBuffer.writeIntBigEndian(i_1);
                     Client.data.copy(class187_11);
                  }
               } else {
                  if (i_2 == 25) {
                     widget_17 = Client.method1649(i_1, i_0);
                     if (widget_17 != null) {
                        class31.method542(-456020317);
                        class87.method2053(i_1, i_0, class78.method1957(class268.method4987(widget_17), (byte) 35), widget_17.field2690, 96373324);
                        Client.isItemSelected = 0;
                        Client.field813 = class292.method5318(widget_17, (byte) 70);
                        if (Client.field813 == null) {
                           Client.field813 = "null";
                        }

                        if (widget_17.field2563) {
                           Client.selectedSpellName = widget_17.field2643 + class73.colorStartTag(16777215);
                        } else {
                           Client.selectedSpellName = class73.colorStartTag(65280) + widget_17.field2686 + class73.colorStartTag(16777215);
                        }
                     }

                     return;
                  }

                  if (i_2 == 26) {
                     class7.method73(-583790135);
                  } else {
                     int i_12;
                     Widget widget_15;
                     if (i_2 == 28) {
                        class187_9 = class235.method4265(ClientPacketProt.field2272, Client.data.field1313);
                        class187_9.outBuffer.writeIntBigEndian(i_1);
                        Client.data.copy(class187_9);
                        widget_15 = WorldMapElement.getWidget(i_1);
                        if (widget_15.field2682 != null && widget_15.field2682[0][0] == 5) {
                           i_12 = widget_15.field2682[0][1];
                           class212.var_configurations[i_12] = 1 - class212.var_configurations[i_12];
                           class10.method124(i_12);
                        }
                     } else if (i_2 == 29) {
                        class187_9 = class235.method4265(ClientPacketProt.field2272, Client.data.field1313);
                        class187_9.outBuffer.writeIntBigEndian(i_1);
                        Client.data.copy(class187_9);
                        widget_15 = WorldMapElement.getWidget(i_1);
                        if (widget_15.field2682 != null && widget_15.field2682[0][0] == 5) {
                           i_12 = widget_15.field2682[0][1];
                           if (class212.var_configurations[i_12] != widget_15.field2684[0]) {
                              class212.var_configurations[i_12] = widget_15.field2684[0];
                              class10.method124(i_12);
                           }
                        }
                     } else if (i_2 == 30) {
                        if (Client.field850 == null) {
                           class56.method1086(i_1, i_0, -881674814);
                           Client.field850 = Client.method1649(i_1, i_0);
                           FriendSystem.invalidateWidget(Client.field850);
                        }
                     } else if (i_2 == 31) {
                        class187_9 = class235.method4265(ClientPacketProt.field2266, Client.data.field1313);
                        class187_9.outBuffer.writeIntReversed(i_1);
                        class187_9.outBuffer.writeIntCustomOrder(class63.field594);
                        class187_9.outBuffer.writeShortWithOffset(class23.field182);
                        class187_9.outBuffer.writeShortLittleEndian(class4.field19);
                        class187_9.outBuffer.writeShortLittleEndian(i_0);
                        class187_9.outBuffer.writeShortWithOffset(i_3);
                        Client.data.copy(class187_9);
                        Client.field759 = 0;
                        class59.field549 = WorldMapElement.getWidget(i_1);
                        Client.field698 = i_0;
                     } else if (i_2 == 32) {
                        class187_9 = class235.method4265(ClientPacketProt.field2232, Client.data.field1313);
                        class187_9.outBuffer.writeIntReversed(class41.field359);
                        class187_9.outBuffer.writeIntBigEndian(i_1);
                        class187_9.outBuffer.writeShortBigEndian(i_0);
                        class187_9.outBuffer.writeShortLittleEndian(i_3);
                        class187_9.outBuffer.writeShortLittleEndian(Client.field848);
                        Client.data.copy(class187_9);
                        Client.field759 = 0;
                        class59.field549 = WorldMapElement.getWidget(i_1);
                        Client.field698 = i_0;
                     } else if (i_2 == 33) {
                        class187_9 = class235.method4265(ClientPacketProt.field2290, Client.data.field1313);
                        class187_9.outBuffer.writeShortLittleEndian(i_3);
                        class187_9.outBuffer.writeIntReversed(i_1);
                        class187_9.outBuffer.writeShortBigEndian(i_0);
                        Client.data.copy(class187_9);
                        Client.field759 = 0;
                        class59.field549 = WorldMapElement.getWidget(i_1);
                        Client.field698 = i_0;
                     } else if (i_2 == 34) {
                        class187_9 = class235.method4265(ClientPacketProt.field2239, Client.data.field1313);
                        class187_9.outBuffer.writeShortWithOffset2(i_3);
                        class187_9.outBuffer.writeIntCustomOrder(i_1);
                        class187_9.outBuffer.writeShortWithOffset(i_0);
                        Client.data.copy(class187_9);
                        Client.field759 = 0;
                        class59.field549 = WorldMapElement.getWidget(i_1);
                        Client.field698 = i_0;
                     } else if (i_2 == 35) {
                        class187_9 = class235.method4265(ClientPacketProt.field2265, Client.data.field1313);
                        class187_9.outBuffer.writeIntLittleEndian(i_1);
                        class187_9.outBuffer.writeShortWithOffset(i_0);
                        class187_9.outBuffer.writeShortWithOffset(i_3);
                        Client.data.copy(class187_9);
                        Client.field759 = 0;
                        class59.field549 = WorldMapElement.getWidget(i_1);
                        Client.field698 = i_0;
                     } else if (i_2 == 36) {
                        class187_9 = class235.method4265(ClientPacketProt.field2281, Client.data.field1313);
                        class187_9.outBuffer.writeShortWithOffset(i_3);
                        class187_9.outBuffer.writeIntBigEndian(i_1);
                        class187_9.outBuffer.writeShortWithOffset(i_0);
                        Client.data.copy(class187_9);
                        Client.field759 = 0;
                        class59.field549 = WorldMapElement.getWidget(i_1);
                        Client.field698 = i_0;
                     } else if (i_2 == 37) {
                        class187_9 = class235.method4265(ClientPacketProt.field2261, Client.data.field1313);
                        class187_9.outBuffer.writeIntBigEndian(i_1);
                        class187_9.outBuffer.writeShortBigEndian(i_0);
                        class187_9.outBuffer.writeShortBigEndian(i_3);
                        Client.data.copy(class187_9);
                        Client.field759 = 0;
                        class59.field549 = WorldMapElement.getWidget(i_1);
                        Client.field698 = i_0;
                     } else {
                        if (i_2 == 38) {
                           class31.method542(-339786927);
                           widget_17 = WorldMapElement.getWidget(i_1);
                           Client.isItemSelected = 1;
                           class23.field182 = i_0;
                           class63.field594 = i_1;
                           class4.field19 = i_3;
                           FriendSystem.invalidateWidget(widget_17);
                           Client.selectedItemName = class73.colorStartTag(16748608) + class26.method404(i_3).name + class73.colorStartTag(16777215);
                           if (Client.selectedItemName == null) {
                              Client.selectedItemName = "null";
                           }

                           return;
                        }

                        if (i_2 == 39) {
                           class187_9 = class235.method4265(ClientPacketProt.field2249, Client.data.field1313);
                           class187_9.outBuffer.writeShortWithOffset(i_3);
                           class187_9.outBuffer.writeIntCustomOrder(i_1);
                           class187_9.outBuffer.writeShortLittleEndian(i_0);
                           Client.data.copy(class187_9);
                           Client.field759 = 0;
                           class59.field549 = WorldMapElement.getWidget(i_1);
                           Client.field698 = i_0;
                        } else if (i_2 == 40) {
                           class187_9 = class235.method4265(ClientPacketProt.field2229, Client.data.field1313);
                           class187_9.outBuffer.writeIntCustomOrder(i_1);
                           class187_9.outBuffer.writeShortLittleEndian(i_0);
                           class187_9.outBuffer.writeShortWithOffset2(i_3);
                           Client.data.copy(class187_9);
                           Client.field759 = 0;
                           class59.field549 = WorldMapElement.getWidget(i_1);
                           Client.field698 = i_0;
                        } else if (i_2 == 41) {
                           class187_9 = class235.method4265(ClientPacketProt.field2268, Client.data.field1313);
                           class187_9.outBuffer.writeIntLittleEndian(i_1);
                           class187_9.outBuffer.writeShortWithOffset2(i_0);
                           class187_9.outBuffer.writeShortBigEndian(i_3);
                           Client.data.copy(class187_9);
                           Client.field759 = 0;
                           class59.field549 = WorldMapElement.getWidget(i_1);
                           Client.field698 = i_0;
                        } else if (i_2 == 42) {
                           class187_9 = class235.method4265(ClientPacketProt.field2267, Client.data.field1313);
                           class187_9.outBuffer.writeIntBigEndian(i_1);
                           class187_9.outBuffer.writeShortWithOffset2(i_0);
                           class187_9.outBuffer.writeShortBigEndian(i_3);
                           Client.data.copy(class187_9);
                           Client.field759 = 0;
                           class59.field549 = WorldMapElement.getWidget(i_1);
                           Client.field698 = i_0;
                        } else if (i_2 == 43) {
                           class187_9 = class235.method4265(ClientPacketProt.field2235, Client.data.field1313);
                           class187_9.outBuffer.writeShortBigEndian(i_3);
                           class187_9.outBuffer.writeIntReversed(i_1);
                           class187_9.outBuffer.writeShortBigEndian(i_0);
                           Client.data.copy(class187_9);
                           Client.field759 = 0;
                           class59.field549 = WorldMapElement.getWidget(i_1);
                           Client.field698 = i_0;
                        } else if (i_2 == 44) {
                           class66_16 = Client.field909[i_3];
                           if (class66_16 != null) {
                              Client.field876 = i_6;
                              Client.field755 = i_7;
                              Client.field757 = 2;
                              Client.field756 = 0;
                              Client.field885 = i_0;
                              Client.field842 = i_1;
                              class187_10 = class235.method4265(ClientPacketProt.field2250, Client.data.field1313);
                              class187_10.outBuffer.writeShortBigEndian(i_3);
                              class187_10.outBuffer.writeNegatedByte(class45.field395[82] ? 1 : 0);
                              Client.data.copy(class187_10);
                           }
                        } else if (i_2 == 45) {
                           class66_16 = Client.field909[i_3];
                           if (class66_16 != null) {
                              Client.field876 = i_6;
                              Client.field755 = i_7;
                              Client.field757 = 2;
                              Client.field756 = 0;
                              Client.field885 = i_0;
                              Client.field842 = i_1;
                              class187_10 = class235.method4265(ClientPacketProt.field2301, Client.data.field1313);
                              class187_10.outBuffer.writeOffsetByte(class45.field395[82] ? 1 : 0);
                              class187_10.outBuffer.writeShortWithOffset2(i_3);
                              Client.data.copy(class187_10);
                           }
                        } else if (i_2 == 46) {
                           class66_16 = Client.field909[i_3];
                           if (class66_16 != null) {
                              Client.field876 = i_6;
                              Client.field755 = i_7;
                              Client.field757 = 2;
                              Client.field756 = 0;
                              Client.field885 = i_0;
                              Client.field842 = i_1;
                              class187_10 = class235.method4265(ClientPacketProt.field2209, Client.data.field1313);
                              class187_10.outBuffer.writeShortWithOffset2(i_3);
                              class187_10.outBuffer.writeByte(class45.field395[82] ? 1 : 0);
                              Client.data.copy(class187_10);
                           }
                        } else if (i_2 == 47) {
                           class66_16 = Client.field909[i_3];
                           if (class66_16 != null) {
                              Client.field876 = i_6;
                              Client.field755 = i_7;
                              Client.field757 = 2;
                              Client.field756 = 0;
                              Client.field885 = i_0;
                              Client.field842 = i_1;
                              class187_10 = class235.method4265(ClientPacketProt.field2230, Client.data.field1313);
                              class187_10.outBuffer.writeShortWithOffset(i_3);
                              class187_10.outBuffer.writeNegatedByte(class45.field395[82] ? 1 : 0);
                              Client.data.copy(class187_10);
                           }
                        } else if (i_2 == 48) {
                           class66_16 = Client.field909[i_3];
                           if (class66_16 != null) {
                              Client.field876 = i_6;
                              Client.field755 = i_7;
                              Client.field757 = 2;
                              Client.field756 = 0;
                              Client.field885 = i_0;
                              Client.field842 = i_1;
                              class187_10 = class235.method4265(ClientPacketProt.field2241, Client.data.field1313);
                              class187_10.outBuffer.writeOffsetByte(class45.field395[82] ? 1 : 0);
                              class187_10.outBuffer.writeShortWithOffset2(i_3);
                              Client.data.copy(class187_10);
                           }
                        } else if (i_2 == 49) {
                           class66_16 = Client.field909[i_3];
                           if (class66_16 != null) {
                              Client.field876 = i_6;
                              Client.field755 = i_7;
                              Client.field757 = 2;
                              Client.field756 = 0;
                              Client.field885 = i_0;
                              Client.field842 = i_1;
                              class187_10 = class235.method4265(ClientPacketProt.field2257, Client.data.field1313);
                              class187_10.outBuffer.writeShortWithOffset2(i_3);
                              class187_10.outBuffer.writeInvertedByte(class45.field395[82] ? 1 : 0);
                              Client.data.copy(class187_10);
                           }
                        } else if (i_2 == 50) {
                           class66_16 = Client.field909[i_3];
                           if (class66_16 != null) {
                              Client.field876 = i_6;
                              Client.field755 = i_7;
                              Client.field757 = 2;
                              Client.field756 = 0;
                              Client.field885 = i_0;
                              Client.field842 = i_1;
                              class187_10 = class235.method4265(ClientPacketProt.field2278, Client.data.field1313);
                              class187_10.outBuffer.writeInvertedByte(class45.field395[82] ? 1 : 0);
                              class187_10.outBuffer.writeShortLittleEndian(i_3);
                              Client.data.copy(class187_10);
                           }
                        } else if (i_2 == 51) {
                           class66_16 = Client.field909[i_3];
                           if (class66_16 != null) {
                              Client.field876 = i_6;
                              Client.field755 = i_7;
                              Client.field757 = 2;
                              Client.field756 = 0;
                              Client.field885 = i_0;
                              Client.field842 = i_1;
                              class187_10 = class235.method4265(ClientPacketProt.field2253, Client.data.field1313);
                              class187_10.outBuffer.writeNegatedByte(class45.field395[82] ? 1 : 0);
                              class187_10.outBuffer.writeShortWithOffset(i_3);
                              Client.data.copy(class187_10);
                           }
                        } else {
                           label926: {
                              if (i_2 != 57) {
                                 if (i_2 == 58) {
                                    widget_17 = Client.method1649(i_1, i_0);
                                    if (widget_17 != null) {
                                       class187_10 = class235.method4265(ClientPacketProt.field2285, Client.data.field1313);
                                       class187_10.outBuffer.writeShortLittleEndian(Client.field848);
                                       class187_10.outBuffer.writeIntCustomOrder(i_1);
                                       class187_10.outBuffer.writeShortLittleEndian(Client.field812);
                                       class187_10.outBuffer.writeShortWithOffset(i_0);
                                       class187_10.outBuffer.writeIntBigEndian(class41.field359);
                                       class187_10.outBuffer.writeShortWithOffset(widget_17.field2690);
                                       Client.data.copy(class187_10);
                                    }
                                    break label926;
                                 }

                                 if (i_2 == 1001) {
                                    Client.field876 = i_6;
                                    Client.field755 = i_7;
                                    Client.field757 = 2;
                                    Client.field756 = 0;
                                    Client.field885 = i_0;
                                    Client.field842 = i_1;
                                    class187_9 = class235.method4265(ClientPacketProt.field2226, Client.data.field1313);
                                    class187_9.outBuffer.writeShortBigEndian(i_3);
                                    class187_9.outBuffer.writeOffsetByte(class45.field395[82] ? 1 : 0);
                                    class187_9.outBuffer.writeShortWithOffset2(i_0 + class196.field2389);
                                    class187_9.outBuffer.writeShortWithOffset(class1.field1 + i_1);
                                    Client.data.copy(class187_9);
                                    break label926;
                                 }

                                 if (i_2 == 1002) {
                                    Client.field876 = i_6;
                                    Client.field755 = i_7;
                                    Client.field757 = 2;
                                    Client.field756 = 0;
                                    class187_9 = class235.method4265(ClientPacketProt.field2244, Client.data.field1313);
                                    class187_9.outBuffer.writeShortWithOffset2(i_3);
                                    Client.data.copy(class187_9);
                                    break label926;
                                 }

                                 if (i_2 == 1003) {
                                    Client.field876 = i_6;
                                    Client.field755 = i_7;
                                    Client.field757 = 2;
                                    Client.field756 = 0;
                                    class79_14 = Client.field694[i_3];
                                    if (class79_14 != null) {
                                       class256 class256_18 = class79_14.field1134;
                                       if (class256_18.field3476 != null) {
                                          class256_18 = class256_18.method4709(942859640);
                                       }

                                       if (class256_18 != null) {
                                          class187_11 = class235.method4265(ClientPacketProt.field2233, Client.data.field1313);
                                          class187_11.outBuffer.writeShortWithOffset2(class256_18.field3467);
                                          Client.data.copy(class187_11);
                                       }
                                    }
                                    break label926;
                                 }

                                 if (i_2 == 1004) {
                                    Client.field876 = i_6;
                                    Client.field755 = i_7;
                                    Client.field757 = 2;
                                    Client.field756 = 0;
                                    class187_9 = class235.method4265(ClientPacketProt.field2227, Client.data.field1313);
                                    class187_9.outBuffer.writeShortLittleEndian(i_3);
                                    Client.data.copy(class187_9);
                                    break label926;
                                 }

                                 if (i_2 == 1005) {
                                    widget_17 = WorldMapElement.getWidget(i_1);
                                    if (widget_17 != null && widget_17.field2705[i_0] >= 100000) {
                                       class62.method1132(27, "", widget_17.field2705[i_0] + " x " + class26.method404(i_3).name);
                                    } else {
                                       class187_10 = class235.method4265(ClientPacketProt.field2227, Client.data.field1313);
                                       class187_10.outBuffer.writeShortLittleEndian(i_3);
                                       Client.data.copy(class187_10);
                                    }

                                    Client.field759 = 0;
                                    class59.field549 = WorldMapElement.getWidget(i_1);
                                    Client.field698 = i_0;
                                    break label926;
                                 }

                                 if (i_2 != 1007) {
                                    if (i_2 == 1010 || i_2 == 1011 || i_2 == 1009 || i_2 == 1008 || i_2 == 1012) {
                                       class136.field1875.method6470(i_2, i_3, new class213(i_0), new class213(i_1), (byte) 8);
                                    }
                                    break label926;
                                 }
                              }

                              widget_17 = Client.method1649(i_1, i_0);
                              if (widget_17 != null) {
                                 method2163(i_3, i_1, i_0, widget_17.field2690, string_5, (byte) 48);
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
      }

      if (Client.isItemSelected != 0) {
         Client.isItemSelected = 0;
         FriendSystem.invalidateWidget(WorldMapElement.getWidget(class63.field594));
      }

      if (Client.isSpellSelected) {
         class31.method542(-102545378);
      }

      if (class59.field549 != null && Client.field759 == 0) {
         FriendSystem.invalidateWidget(class59.field549);
      }

   }

   public static int method2176(int i_0, byte b_1) {
      long long_3 = class128.field1750[i_0];
      int i_2 = (int)(long_3 >>> 7 & 0x7fL);
      return i_2;
   }

   static void method2163(int i_0, int i_1, int i_2, int i_3, String string_4, byte b_5) {
      Widget widget_6 = Client.method1649(i_1, i_2);
      if (widget_6 != null) {
         if (widget_6.field2656 != null) {
            class62 class62_7 = new class62();
            class62_7.field575 = widget_6;
            class62_7.field578 = i_0;
            class62_7.field582 = string_4;
            class62_7.field581 = widget_6.field2656;
            class184.method3613(class62_7);
         }

         boolean bool_12 = true;
         if (widget_6.field2568 > 0) {
            bool_12 = HealthBarUpdate.method149(widget_6);
         }

         if (bool_12) {
            int i_9 = class268.method4987(widget_6);
            int i_10 = i_0 - 1;
            boolean bool_8 = (i_9 >> i_10 + 1 & 0x1) != 0;
            if (bool_8) {
               class187 class187_11;
               if (i_0 == 1) {
                  class187_11 = class235.method4265(ClientPacketProt.field2271, Client.data.field1313);
                  class187_11.outBuffer.writeIntBigEndian(i_1);
                  class187_11.outBuffer.writeShortBigEndian(i_2);
                  class187_11.outBuffer.writeShortBigEndian(i_3);
                  Client.data.copy(class187_11);
               }

               if (i_0 == 2) {
                  class187_11 = class235.method4265(ClientPacketProt.field2255, Client.data.field1313);
                  class187_11.outBuffer.writeIntBigEndian(i_1);
                  class187_11.outBuffer.writeShortBigEndian(i_2);
                  class187_11.outBuffer.writeShortBigEndian(i_3);
                  Client.data.copy(class187_11);
               }

               if (i_0 == 3) {
                  class187_11 = class235.method4265(ClientPacketProt.field2206, Client.data.field1313);
                  class187_11.outBuffer.writeIntBigEndian(i_1);
                  class187_11.outBuffer.writeShortBigEndian(i_2);
                  class187_11.outBuffer.writeShortBigEndian(i_3);
                  Client.data.copy(class187_11);
               }

               if (i_0 == 4) {
                  class187_11 = class235.method4265(ClientPacketProt.field2222, Client.data.field1313);
                  class187_11.outBuffer.writeIntBigEndian(i_1);
                  class187_11.outBuffer.writeShortBigEndian(i_2);
                  class187_11.outBuffer.writeShortBigEndian(i_3);
                  Client.data.copy(class187_11);
               }

               if (i_0 == 5) {
                  class187_11 = class235.method4265(ClientPacketProt.field2243, Client.data.field1313);
                  class187_11.outBuffer.writeIntBigEndian(i_1);
                  class187_11.outBuffer.writeShortBigEndian(i_2);
                  class187_11.outBuffer.writeShortBigEndian(i_3);
                  Client.data.copy(class187_11);
               }

               if (i_0 == 6) {
                  class187_11 = class235.method4265(ClientPacketProt.field2264, Client.data.field1313);
                  class187_11.outBuffer.writeIntBigEndian(i_1);
                  class187_11.outBuffer.writeShortBigEndian(i_2);
                  class187_11.outBuffer.writeShortBigEndian(i_3);
                  Client.data.copy(class187_11);
               }

               if (i_0 == 7) {
                  class187_11 = class235.method4265(ClientPacketProt.field2288, Client.data.field1313);
                  class187_11.outBuffer.writeIntBigEndian(i_1);
                  class187_11.outBuffer.writeShortBigEndian(i_2);
                  class187_11.outBuffer.writeShortBigEndian(i_3);
                  Client.data.copy(class187_11);
               }

               if (i_0 == 8) {
                  class187_11 = class235.method4265(ClientPacketProt.field2251, Client.data.field1313);
                  class187_11.outBuffer.writeIntBigEndian(i_1);
                  class187_11.outBuffer.writeShortBigEndian(i_2);
                  class187_11.outBuffer.writeShortBigEndian(i_3);
                  Client.data.copy(class187_11);
               }

               if (i_0 == 9) {
                  class187_11 = class235.method4265(ClientPacketProt.field2287, Client.data.field1313);
                  class187_11.outBuffer.writeIntBigEndian(i_1);
                  class187_11.outBuffer.writeShortBigEndian(i_2);
                  class187_11.outBuffer.writeShortBigEndian(i_3);
                  Client.data.copy(class187_11);
               }

               if (i_0 == 10) {
                  class187_11 = class235.method4265(ClientPacketProt.field2289, Client.data.field1313);
                  class187_11.outBuffer.writeIntBigEndian(i_1);
                  class187_11.outBuffer.writeShortBigEndian(i_2);
                  class187_11.outBuffer.writeShortBigEndian(i_3);
                  Client.data.copy(class187_11);
               }

            }
         }
      }
   }

}
