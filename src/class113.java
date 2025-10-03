public class class113 extends class115 {

   int field1476;
   int field1473;
   boolean field1478;
   int field1469;
   int field1470;
   int field1475;
   int field1471;
   int field1479;
   int field1480;
   int field1481;
   int field1468;
   int field1477;
   int field1472;
   int field1482;
   int field1474;

   class113(RawSound rawSound_1, int i_2, int i_3, int i_4) {
      super.field1497 = rawSound_1;
      this.field1476 = rawSound_1.field1391;
      this.field1473 = rawSound_1.field1392;
      this.field1478 = rawSound_1.field1393;
      this.field1469 = i_2;
      this.field1470 = i_3;
      this.field1475 = i_4;
      this.field1471 = 0;
      this.method2525();
   }

   class113(RawSound rawSound_1, int i_2, int i_3) {
      super.field1497 = rawSound_1;
      this.field1476 = rawSound_1.field1391;
      this.field1473 = rawSound_1.field1392;
      this.field1478 = rawSound_1.field1393;
      this.field1469 = i_2;
      this.field1470 = i_3;
      this.field1475 = 8192;
      this.field1471 = 0;
      this.method2525();
   }

   public synchronized int method2541() {
      return this.field1475 < 0 ? -1 : this.field1475;
   }

   synchronized void method2607(int i_1) {
      this.method2600(i_1, this.method2541());
   }

   synchronized void method2600(int i_1, int i_2) {
      this.field1470 = i_1;
      this.field1475 = i_2;
      this.field1479 = 0;
      this.method2525();
   }

   public synchronized void method2536(int i_1, int i_2, int i_3) {
      if (i_1 == 0) {
         this.method2600(i_2, i_3);
      } else {
         int i_4 = method2526(i_2, i_3);
         int i_5 = method2519(i_2, i_3);
         if (i_4 == this.field1482 && i_5 == this.field1474) {
            this.field1479 = 0;
         } else {
            int i_6 = i_2 - this.field1472;
            if (this.field1472 - i_2 > i_6) {
               i_6 = this.field1472 - i_2;
            }

            if (i_4 - this.field1482 > i_6) {
               i_6 = i_4 - this.field1482;
            }

            if (this.field1482 - i_4 > i_6) {
               i_6 = this.field1482 - i_4;
            }

            if (i_5 - this.field1474 > i_6) {
               i_6 = i_5 - this.field1474;
            }

            if (this.field1474 - i_5 > i_6) {
               i_6 = this.field1474 - i_5;
            }

            if (i_1 > i_6) {
               i_1 = i_6;
            }

            this.field1479 = i_1;
            this.field1470 = i_2;
            this.field1475 = i_3;
            this.field1480 = (i_2 - this.field1472) / i_1;
            this.field1481 = (i_4 - this.field1482) / i_1;
            this.field1468 = (i_5 - this.field1474) / i_1;
         }
      }
   }

   public synchronized void vmethod3893(int[] ints_1, int i_2, int i_3) {
      if (this.field1470 == 0 && this.field1479 == 0) {
         this.vmethod3906(i_3);
      } else {
         RawSound rawSound_4 = (RawSound) super.field1497;
         int i_5 = this.field1476 << 8;
         int i_6 = this.field1473 << 8;
         int i_7 = rawSound_4.field1390.length << 8;
         int i_8 = i_6 - i_5;
         if (i_8 <= 0) {
            this.field1477 = 0;
         }

         int i_9 = i_2;
         i_3 += i_2;
         if (this.field1471 < 0) {
            if (this.field1469 <= 0) {
               this.method2647();
               this.unlink();
               return;
            }

            this.field1471 = 0;
         }

         if (this.field1471 >= i_7) {
            if (this.field1469 >= 0) {
               this.method2647();
               this.unlink();
               return;
            }

            this.field1471 = i_7 - 1;
         }

         if (this.field1477 < 0) {
            if (this.field1478) {
               if (this.field1469 < 0) {
                  i_9 = this.method2641(ints_1, i_2, i_5, i_3, rawSound_4.field1390[this.field1476]);
                  if (this.field1471 >= i_5) {
                     return;
                  }

                  this.field1471 = i_5 + i_5 - 1 - this.field1471;
                  this.field1469 = -this.field1469;
               }

               while (true) {
                  i_9 = this.method2543(ints_1, i_9, i_6, i_3, rawSound_4.field1390[this.field1473 - 1]);
                  if (this.field1471 < i_6) {
                     return;
                  }

                  this.field1471 = i_6 + i_6 - 1 - this.field1471;
                  this.field1469 = -this.field1469;
                  i_9 = this.method2641(ints_1, i_9, i_5, i_3, rawSound_4.field1390[this.field1476]);
                  if (this.field1471 >= i_5) {
                     return;
                  }

                  this.field1471 = i_5 + i_5 - 1 - this.field1471;
                  this.field1469 = -this.field1469;
               }
            } else if (this.field1469 < 0) {
               while (true) {
                  i_9 = this.method2641(ints_1, i_9, i_5, i_3, rawSound_4.field1390[this.field1473 - 1]);
                  if (this.field1471 >= i_5) {
                     return;
                  }

                  this.field1471 = i_6 - 1 - (i_6 - 1 - this.field1471) % i_8;
               }
            } else {
               while (true) {
                  i_9 = this.method2543(ints_1, i_9, i_6, i_3, rawSound_4.field1390[this.field1476]);
                  if (this.field1471 < i_6) {
                     return;
                  }

                  this.field1471 = i_5 + (this.field1471 - i_5) % i_8;
               }
            }
         } else {
            if (this.field1477 > 0) {
               if (this.field1478) {
                  label119: {
                     if (this.field1469 < 0) {
                        i_9 = this.method2641(ints_1, i_2, i_5, i_3, rawSound_4.field1390[this.field1476]);
                        if (this.field1471 >= i_5) {
                           return;
                        }

                        this.field1471 = i_5 + i_5 - 1 - this.field1471;
                        this.field1469 = -this.field1469;
                        if (--this.field1477 == 0) {
                           break label119;
                        }
                     }

                     do {
                        i_9 = this.method2543(ints_1, i_9, i_6, i_3, rawSound_4.field1390[this.field1473 - 1]);
                        if (this.field1471 < i_6) {
                           return;
                        }

                        this.field1471 = i_6 + i_6 - 1 - this.field1471;
                        this.field1469 = -this.field1469;
                        if (--this.field1477 == 0) {
                           break;
                        }

                        i_9 = this.method2641(ints_1, i_9, i_5, i_3, rawSound_4.field1390[this.field1476]);
                        if (this.field1471 >= i_5) {
                           return;
                        }

                        this.field1471 = i_5 + i_5 - 1 - this.field1471;
                        this.field1469 = -this.field1469;
                     } while (--this.field1477 != 0);
                  }
               } else {
                  int i_10;
                  if (this.field1469 < 0) {
                     while (true) {
                        i_9 = this.method2641(ints_1, i_9, i_5, i_3, rawSound_4.field1390[this.field1473 - 1]);
                        if (this.field1471 >= i_5) {
                           return;
                        }

                        i_10 = (i_6 - 1 - this.field1471) / i_8;
                        if (i_10 >= this.field1477) {
                           this.field1471 += i_8 * this.field1477;
                           this.field1477 = 0;
                           break;
                        }

                        this.field1471 += i_8 * i_10;
                        this.field1477 -= i_10;
                     }
                  } else {
                     while (true) {
                        i_9 = this.method2543(ints_1, i_9, i_6, i_3, rawSound_4.field1390[this.field1476]);
                        if (this.field1471 < i_6) {
                           return;
                        }

                        i_10 = (this.field1471 - i_5) / i_8;
                        if (i_10 >= this.field1477) {
                           this.field1471 -= i_8 * this.field1477;
                           this.field1477 = 0;
                           break;
                        }

                        this.field1471 -= i_8 * i_10;
                        this.field1477 -= i_10;
                     }
                  }
               }
            }

            if (this.field1469 < 0) {
               this.method2641(ints_1, i_9, 0, i_3, 0);
               if (this.field1471 < 0) {
                  this.field1471 = -1;
                  this.method2647();
                  this.unlink();
               }
            } else {
               this.method2543(ints_1, i_9, i_7, i_3, 0);
               if (this.field1471 >= i_7) {
                  this.field1471 = i_7;
                  this.method2647();
                  this.unlink();
               }
            }

         }
      }
   }

   public synchronized void vmethod3906(int i_1) {
      if (this.field1479 > 0) {
         if (i_1 >= this.field1479) {
            if (this.field1470 == Integer.MIN_VALUE) {
               this.field1470 = 0;
               this.field1474 = 0;
               this.field1482 = 0;
               this.field1472 = 0;
               this.unlink();
               i_1 = this.field1479;
            }

            this.field1479 = 0;
            this.method2525();
         } else {
            this.field1472 += this.field1480 * i_1;
            this.field1482 += this.field1481 * i_1;
            this.field1474 += this.field1468 * i_1;
            this.field1479 -= i_1;
         }
      }

      RawSound rawSound_2 = (RawSound) super.field1497;
      int i_3 = this.field1476 << 8;
      int i_4 = this.field1473 << 8;
      int i_5 = rawSound_2.field1390.length << 8;
      int i_6 = i_4 - i_3;
      if (i_6 <= 0) {
         this.field1477 = 0;
      }

      if (this.field1471 < 0) {
         if (this.field1469 <= 0) {
            this.method2647();
            this.unlink();
            return;
         }

         this.field1471 = 0;
      }

      if (this.field1471 >= i_5) {
         if (this.field1469 >= 0) {
            this.method2647();
            this.unlink();
            return;
         }

         this.field1471 = i_5 - 1;
      }

      this.field1471 += this.field1469 * i_1;
      if (this.field1477 < 0) {
         if (!this.field1478) {
            if (this.field1469 < 0) {
               if (this.field1471 >= i_3) {
                  return;
               }

               this.field1471 = i_4 - 1 - (i_4 - 1 - this.field1471) % i_6;
            } else {
               if (this.field1471 < i_4) {
                  return;
               }

               this.field1471 = i_3 + (this.field1471 - i_3) % i_6;
            }

         } else {
            if (this.field1469 < 0) {
               if (this.field1471 >= i_3) {
                  return;
               }

               this.field1471 = i_3 + i_3 - 1 - this.field1471;
               this.field1469 = -this.field1469;
            }

            while (this.field1471 >= i_4) {
               this.field1471 = i_4 + i_4 - 1 - this.field1471;
               this.field1469 = -this.field1469;
               if (this.field1471 >= i_3) {
                  return;
               }

               this.field1471 = i_3 + i_3 - 1 - this.field1471;
               this.field1469 = -this.field1469;
            }

         }
      } else {
         if (this.field1477 > 0) {
            if (this.field1478) {
               label127: {
                  if (this.field1469 < 0) {
                     if (this.field1471 >= i_3) {
                        return;
                     }

                     this.field1471 = i_3 + i_3 - 1 - this.field1471;
                     this.field1469 = -this.field1469;
                     if (--this.field1477 == 0) {
                        break label127;
                     }
                  }

                  do {
                     if (this.field1471 < i_4) {
                        return;
                     }

                     this.field1471 = i_4 + i_4 - 1 - this.field1471;
                     this.field1469 = -this.field1469;
                     if (--this.field1477 == 0) {
                        break;
                     }

                     if (this.field1471 >= i_3) {
                        return;
                     }

                     this.field1471 = i_3 + i_3 - 1 - this.field1471;
                     this.field1469 = -this.field1469;
                  } while (--this.field1477 != 0);
               }
            } else {
               int i_7;
               if (this.field1469 < 0) {
                  if (this.field1471 >= i_3) {
                     return;
                  }

                  i_7 = (i_4 - 1 - this.field1471) / i_6;
                  if (i_7 < this.field1477) {
                     this.field1471 += i_6 * i_7;
                     this.field1477 -= i_7;
                     return;
                  }

                  this.field1471 += i_6 * this.field1477;
                  this.field1477 = 0;
               } else {
                  if (this.field1471 < i_4) {
                     return;
                  }

                  i_7 = (this.field1471 - i_3) / i_6;
                  if (i_7 < this.field1477) {
                     this.field1471 -= i_6 * i_7;
                     this.field1477 -= i_7;
                     return;
                  }

                  this.field1471 -= i_6 * this.field1477;
                  this.field1477 = 0;
               }
            }
         }

         if (this.field1469 < 0) {
            if (this.field1471 < 0) {
               this.field1471 = -1;
               this.method2647();
               this.unlink();
            }
         } else if (this.field1471 >= i_5) {
            this.field1471 = i_5;
            this.method2647();
            this.unlink();
         }

      }
   }

   void method2525() {
      this.field1472 = this.field1470;
      this.field1482 = method2526(this.field1470, this.field1475);
      this.field1474 = method2519(this.field1470, this.field1475);
   }

   public synchronized void method2596(int i_1) {
      int i_2 = ((RawSound) super.field1497).field1390.length << 8;
      if (i_1 < -1) {
         i_1 = -1;
      }

      if (i_1 > i_2) {
         i_1 = i_2;
      }

      this.field1471 = i_1;
   }

   protected class115 vmethod3891() {
      return null;
   }

   public boolean method2558() {
      return this.field1471 < 0 || this.field1471 >= ((RawSound) super.field1497).field1390.length << 8;
   }

   public synchronized void method2538(int i_1) {
      if (this.field1469 < 0) {
         this.field1469 = -i_1;
      } else {
         this.field1469 = i_1;
      }

   }

   public synchronized void method2540(int i_1) {
      if (i_1 == 0) {
         this.method2607(0);
         this.unlink();
      } else if (this.field1482 == 0 && this.field1474 == 0) {
         this.field1479 = 0;
         this.field1470 = 0;
         this.field1472 = 0;
         this.unlink();
      } else {
         int i_2 = -this.field1472;
         if (this.field1472 > i_2) {
            i_2 = this.field1472;
         }

         if (-this.field1482 > i_2) {
            i_2 = -this.field1482;
         }

         if (this.field1482 > i_2) {
            i_2 = this.field1482;
         }

         if (-this.field1474 > i_2) {
            i_2 = -this.field1474;
         }

         if (this.field1474 > i_2) {
            i_2 = this.field1474;
         }

         if (i_1 > i_2) {
            i_1 = i_2;
         }

         this.field1479 = i_1;
         this.field1470 = Integer.MIN_VALUE;
         this.field1480 = -this.field1472 / i_1;
         this.field1481 = -this.field1482 / i_1;
         this.field1468 = -this.field1474 / i_1;
      }
   }

   void method2647() {
      if (this.field1479 != 0) {
         if (this.field1470 == Integer.MIN_VALUE) {
            this.field1470 = 0;
         }

         this.field1479 = 0;
         this.method2525();
      }

   }

   public boolean method2585() {
      return this.field1479 != 0;
   }

   public synchronized void method2614(boolean bool_1) {
      this.field1469 = (this.field1469 ^ this.field1469 >> 31) + (this.field1469 >>> 31);
      this.field1469 = -this.field1469;
   }

   protected class115 vmethod3894() {
      return null;
   }

   int vmethod2689() {
      int i_1 = this.field1472 * 3 >> 6;
      i_1 = (i_1 ^ i_1 >> 31) + (i_1 >>> 31);
      if (this.field1477 == 0) {
         i_1 -= i_1 * this.field1471 / (((RawSound) super.field1497).field1390.length << 8);
      } else if (this.field1477 >= 0) {
         i_1 -= i_1 * this.field1476 / ((RawSound) super.field1497).field1390.length;
      }

      return i_1 > 255 ? 255 : i_1;
   }

   int method2641(int[] ints_1, int i_2, int i_3, int i_4, int i_5) {
      while (true) {
         if (this.field1479 > 0) {
            int i_6 = i_2 + this.field1479;
            if (i_6 > i_4) {
               i_6 = i_4;
            }

            this.field1479 += i_2;
            if (this.field1469 == -256 && (this.field1471 & 0xff) == 0) {
               if (class169.field2053) {
                  i_2 = method2561(0, ((RawSound) super.field1497).field1390, ints_1, this.field1471, i_2, this.field1482, this.field1474, this.field1481, this.field1468, 0, i_6, i_3, this);
               } else {
                  i_2 = method2560(((RawSound) super.field1497).field1390, ints_1, this.field1471, i_2, this.field1472, this.field1480, 0, i_6, i_3, this);
               }
            } else if (class169.field2053) {
               i_2 = method2605(0, 0, ((RawSound) super.field1497).field1390, ints_1, this.field1471, i_2, this.field1482, this.field1474, this.field1481, this.field1468, 0, i_6, i_3, this, this.field1469, i_5);
            } else {
               i_2 = method2569(0, 0, ((RawSound) super.field1497).field1390, ints_1, this.field1471, i_2, this.field1472, this.field1480, 0, i_6, i_3, this, this.field1469, i_5);
            }

            this.field1479 -= i_2;
            if (this.field1479 != 0) {
               return i_2;
            }

            if (!this.method2530()) {
               continue;
            }

            return i_4;
         }

         if (this.field1469 == -256 && (this.field1471 & 0xff) == 0) {
            if (class169.field2053) {
               return method2553(0, ((RawSound) super.field1497).field1390, ints_1, this.field1471, i_2, this.field1482, this.field1474, 0, i_4, i_3, this);
            }

            return method2594(((RawSound) super.field1497).field1390, ints_1, this.field1471, i_2, this.field1472, 0, i_4, i_3, this);
         }

         if (class169.field2053) {
            return method2557(0, 0, ((RawSound) super.field1497).field1390, ints_1, this.field1471, i_2, this.field1482, this.field1474, 0, i_4, i_3, this, this.field1469, i_5);
         }

         return method2556(0, 0, ((RawSound) super.field1497).field1390, ints_1, this.field1471, i_2, this.field1472, 0, i_4, i_3, this, this.field1469, i_5);
      }
   }

   public synchronized int method2539() {
      return this.field1469 < 0 ? -this.field1469 : this.field1469;
   }

   boolean method2530() {
      int i_1 = this.field1470;
      int i_2;
      int i_3;
      if (i_1 == Integer.MIN_VALUE) {
         i_3 = 0;
         i_2 = 0;
         i_1 = 0;
      } else {
         i_2 = method2526(i_1, this.field1475);
         i_3 = method2519(i_1, this.field1475);
      }

      if (i_1 == this.field1472 && i_2 == this.field1482 && i_3 == this.field1474) {
         if (this.field1470 == Integer.MIN_VALUE) {
            this.field1470 = 0;
            this.field1474 = 0;
            this.field1482 = 0;
            this.field1472 = 0;
            this.unlink();
            return true;
         } else {
            this.method2525();
            return false;
         }
      } else {
         if (this.field1472 < i_1) {
            this.field1480 = 1;
            this.field1479 = i_1 - this.field1472;
         } else if (this.field1472 > i_1) {
            this.field1480 = -1;
            this.field1479 = this.field1472 - i_1;
         } else {
            this.field1480 = 0;
         }

         if (this.field1482 < i_2) {
            this.field1481 = 1;
            if (this.field1479 == 0 || this.field1479 > i_2 - this.field1482) {
               this.field1479 = i_2 - this.field1482;
            }
         } else if (this.field1482 > i_2) {
            this.field1481 = -1;
            if (this.field1479 == 0 || this.field1479 > this.field1482 - i_2) {
               this.field1479 = this.field1482 - i_2;
            }
         } else {
            this.field1481 = 0;
         }

         if (this.field1474 < i_3) {
            this.field1468 = 1;
            if (this.field1479 == 0 || this.field1479 > i_3 - this.field1474) {
               this.field1479 = i_3 - this.field1474;
            }
         } else if (this.field1474 > i_3) {
            this.field1468 = -1;
            if (this.field1479 == 0 || this.field1479 > this.field1474 - i_3) {
               this.field1479 = this.field1474 - i_3;
            }
         } else {
            this.field1468 = 0;
         }

         return false;
      }
   }

   int method2543(int[] ints_1, int i_2, int i_3, int i_4, int i_5) {
      while (true) {
         if (this.field1479 > 0) {
            int i_6 = i_2 + this.field1479;
            if (i_6 > i_4) {
               i_6 = i_4;
            }

            this.field1479 += i_2;
            if (this.field1469 == 256 && (this.field1471 & 0xff) == 0) {
               if (class169.field2053) {
                  i_2 = method2559(0, ((RawSound) super.field1497).field1390, ints_1, this.field1471, i_2, this.field1482, this.field1474, this.field1481, this.field1468, 0, i_6, i_3, this);
               } else {
                  i_2 = method2586(((RawSound) super.field1497).field1390, ints_1, this.field1471, i_2, this.field1472, this.field1480, 0, i_6, i_3, this);
               }
            } else if (class169.field2053) {
               i_2 = method2627(0, 0, ((RawSound) super.field1497).field1390, ints_1, this.field1471, i_2, this.field1482, this.field1474, this.field1481, this.field1468, 0, i_6, i_3, this, this.field1469, i_5);
            } else {
               i_2 = method2633(0, 0, ((RawSound) super.field1497).field1390, ints_1, this.field1471, i_2, this.field1472, this.field1480, 0, i_6, i_3, this, this.field1469, i_5);
            }

            this.field1479 -= i_2;
            if (this.field1479 != 0) {
               return i_2;
            }

            if (!this.method2530()) {
               continue;
            }

            return i_4;
         }

         if (this.field1469 == 256 && (this.field1471 & 0xff) == 0) {
            if (class169.field2053) {
               return method2551(0, ((RawSound) super.field1497).field1390, ints_1, this.field1471, i_2, this.field1482, this.field1474, 0, i_4, i_3, this);
            }

            return method2550(((RawSound) super.field1497).field1390, ints_1, this.field1471, i_2, this.field1472, 0, i_4, i_3, this);
         }

         if (class169.field2053) {
            return method2555(0, 0, ((RawSound) super.field1497).field1390, ints_1, this.field1471, i_2, this.field1482, this.field1474, 0, i_4, i_3, this, this.field1469, i_5);
         }

         return method2554(0, 0, ((RawSound) super.field1497).field1390, ints_1, this.field1471, i_2, this.field1472, 0, i_4, i_3, this, this.field1469, i_5);
      }
   }

   public synchronized int method2531() {
      return this.field1470 == Integer.MIN_VALUE ? 0 : this.field1470;
   }

   public synchronized void method2626(int i_1) {
      this.field1477 = i_1;
   }

   protected int vmethod3892() {
      return this.field1470 == 0 && this.field1479 == 0 ? 0 : 1;
   }

   public synchronized void method2535(int i_1, int i_2) {
      this.method2536(i_1, i_2, this.method2541());
   }

   public synchronized void method2527(int i_1) {
      this.method2600(i_1 << 6, this.method2541());
   }

   static int method2526(int i_0, int i_1) {
      return i_1 < 0 ? i_0 : (int)((double)i_0 * Math.sqrt((double)(16384 - i_1) * 1.220703125E-4D) + 0.5D);
   }

   static int method2519(int i_0, int i_1) {
      return i_1 < 0 ? -i_0 : (int)((double)i_0 * Math.sqrt((double)i_1 * 1.220703125E-4D) + 0.5D);
   }

   static int method2554(int i_0, int i_1, byte[] bytes_2, int[] ints_3, int i_4, int i_5, int i_6, int i_7, int i_8, int i_9, class113 class113_10, int i_11, int i_12) {
      if (i_11 == 0 || (i_7 = i_5 + (i_11 + (i_9 - i_4) - 257) / i_11) > i_8) {
         i_7 = i_8;
      }

      byte b_13;
      int i_10001;
      while (i_5 < i_7) {
         i_1 = i_4 >> 8;
         b_13 = bytes_2[i_1];
         i_10001 = i_5++;
         ints_3[i_10001] += ((b_13 << 8) + (bytes_2[i_1 + 1] - b_13) * (i_4 & 0xff)) * i_6 >> 6;
         i_4 += i_11;
      }

      if (i_11 == 0 || (i_7 = i_5 + (i_11 + (i_9 - i_4) - 1) / i_11) > i_8) {
         i_7 = i_8;
      }

      for (i_1 = i_12; i_5 < i_7; i_4 += i_11) {
         b_13 = bytes_2[i_4 >> 8];
         i_10001 = i_5++;
         ints_3[i_10001] += ((b_13 << 8) + (i_1 - b_13) * (i_4 & 0xff)) * i_6 >> 6;
      }

      class113_10.field1471 = i_4;
      return i_5;
   }

   static int method2556(int i_0, int i_1, byte[] bytes_2, int[] ints_3, int i_4, int i_5, int i_6, int i_7, int i_8, int i_9, class113 class113_10, int i_11, int i_12) {
      if (i_11 == 0 || (i_7 = i_5 + (i_11 + (i_9 + 256 - i_4)) / i_11) > i_8) {
         i_7 = i_8;
      }

      int i_10001;
      while (i_5 < i_7) {
         i_1 = i_4 >> 8;
         byte b_13 = bytes_2[i_1 - 1];
         i_10001 = i_5++;
         ints_3[i_10001] += ((b_13 << 8) + (bytes_2[i_1] - b_13) * (i_4 & 0xff)) * i_6 >> 6;
         i_4 += i_11;
      }

      if (i_11 == 0 || (i_7 = i_5 + (i_11 + (i_9 - i_4)) / i_11) > i_8) {
         i_7 = i_8;
      }

      i_0 = i_12;

      for (i_1 = i_11; i_5 < i_7; i_4 += i_1) {
         i_10001 = i_5++;
         ints_3[i_10001] += ((i_0 << 8) + (bytes_2[i_4 >> 8] - i_0) * (i_4 & 0xff)) * i_6 >> 6;
      }

      class113_10.field1471 = i_4;
      return i_5;
   }

   static int method2550(byte[] bytes_0, int[] ints_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, class113 class113_8) {
      i_2 >>= 8;
      i_7 >>= 8;
      i_4 <<= 2;
      if ((i_5 = i_3 + i_7 - i_2) > i_6) {
         i_5 = i_6;
      }

      int i_10001;
      for (i_5 -= 3; i_3 < i_5; ints_1[i_10001] += bytes_0[i_2++] * i_4) {
         i_10001 = i_3++;
         ints_1[i_10001] += bytes_0[i_2++] * i_4;
         i_10001 = i_3++;
         ints_1[i_10001] += bytes_0[i_2++] * i_4;
         i_10001 = i_3++;
         ints_1[i_10001] += bytes_0[i_2++] * i_4;
         i_10001 = i_3++;
      }

      for (i_5 += 3; i_3 < i_5; ints_1[i_10001] += bytes_0[i_2++] * i_4) {
         i_10001 = i_3++;
      }

      class113_8.field1471 = i_2 << 8;
      return i_3;
   }

   static int method2555(int i_0, int i_1, byte[] bytes_2, int[] ints_3, int i_4, int i_5, int i_6, int i_7, int i_8, int i_9, int i_10, class113 class113_11, int i_12, int i_13) {
      if (i_12 == 0 || (i_8 = i_5 + (i_10 - i_4 + i_12 - 257) / i_12) > i_9) {
         i_8 = i_9;
      }

      i_5 <<= 1;

      byte b_14;
      int i_10001;
      for (i_8 <<= 1; i_5 < i_8; i_4 += i_12) {
         i_1 = i_4 >> 8;
         b_14 = bytes_2[i_1];
         i_0 = (b_14 << 8) + (i_4 & 0xff) * (bytes_2[i_1 + 1] - b_14);
         i_10001 = i_5++;
         ints_3[i_10001] += i_0 * i_6 >> 6;
         i_10001 = i_5++;
         ints_3[i_10001] += i_0 * i_7 >> 6;
      }

      if (i_12 == 0 || (i_8 = (i_5 >> 1) + (i_10 - i_4 + i_12 - 1) / i_12) > i_9) {
         i_8 = i_9;
      }

      i_8 <<= 1;

      for (i_1 = i_13; i_5 < i_8; i_4 += i_12) {
         b_14 = bytes_2[i_4 >> 8];
         i_0 = (b_14 << 8) + (i_1 - b_14) * (i_4 & 0xff);
         i_10001 = i_5++;
         ints_3[i_10001] += i_0 * i_6 >> 6;
         i_10001 = i_5++;
         ints_3[i_10001] += i_0 * i_7 >> 6;
      }

      class113_11.field1471 = i_4;
      return i_5 >> 1;
   }

   static int method2594(byte[] bytes_0, int[] ints_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, class113 class113_8) {
      i_2 >>= 8;
      i_7 >>= 8;
      i_4 <<= 2;
      if ((i_5 = i_3 + i_2 - (i_7 - 1)) > i_6) {
         i_5 = i_6;
      }

      int i_10001;
      for (i_5 -= 3; i_3 < i_5; ints_1[i_10001] += bytes_0[i_2--] * i_4) {
         i_10001 = i_3++;
         ints_1[i_10001] += bytes_0[i_2--] * i_4;
         i_10001 = i_3++;
         ints_1[i_10001] += bytes_0[i_2--] * i_4;
         i_10001 = i_3++;
         ints_1[i_10001] += bytes_0[i_2--] * i_4;
         i_10001 = i_3++;
      }

      for (i_5 += 3; i_3 < i_5; ints_1[i_10001] += bytes_0[i_2--] * i_4) {
         i_10001 = i_3++;
      }

      class113_8.field1471 = i_2 << 8;
      return i_3;
   }

   static int method2557(int i_0, int i_1, byte[] bytes_2, int[] ints_3, int i_4, int i_5, int i_6, int i_7, int i_8, int i_9, int i_10, class113 class113_11, int i_12, int i_13) {
      if (i_12 == 0 || (i_8 = i_5 + (i_10 + 256 - i_4 + i_12) / i_12) > i_9) {
         i_8 = i_9;
      }

      i_5 <<= 1;

      int i_10001;
      for (i_8 <<= 1; i_5 < i_8; i_4 += i_12) {
         i_1 = i_4 >> 8;
         byte b_14 = bytes_2[i_1 - 1];
         i_0 = (bytes_2[i_1] - b_14) * (i_4 & 0xff) + (b_14 << 8);
         i_10001 = i_5++;
         ints_3[i_10001] += i_0 * i_6 >> 6;
         i_10001 = i_5++;
         ints_3[i_10001] += i_0 * i_7 >> 6;
      }

      if (i_12 == 0 || (i_8 = (i_5 >> 1) + (i_10 - i_4 + i_12) / i_12) > i_9) {
         i_8 = i_9;
      }

      i_8 <<= 1;

      for (i_1 = i_13; i_5 < i_8; i_4 += i_12) {
         i_0 = (i_1 << 8) + (i_4 & 0xff) * (bytes_2[i_4 >> 8] - i_1);
         i_10001 = i_5++;
         ints_3[i_10001] += i_0 * i_6 >> 6;
         i_10001 = i_5++;
         ints_3[i_10001] += i_0 * i_7 >> 6;
      }

      class113_11.field1471 = i_4;
      return i_5 >> 1;
   }

   static int method2551(int i_0, byte[] bytes_1, int[] ints_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8, int i_9, class113 class113_10) {
      i_3 >>= 8;
      i_9 >>= 8;
      i_5 <<= 2;
      i_6 <<= 2;
      if ((i_7 = i_4 + i_9 - i_3) > i_8) {
         i_7 = i_8;
      }

      i_4 <<= 1;
      i_7 <<= 1;

      int i_10001;
      byte b_11;
      for (i_7 -= 6; i_4 < i_7; ints_2[i_10001] += b_11 * i_6) {
         b_11 = bytes_1[i_3++];
         i_10001 = i_4++;
         ints_2[i_10001] += b_11 * i_5;
         i_10001 = i_4++;
         ints_2[i_10001] += b_11 * i_6;
         b_11 = bytes_1[i_3++];
         i_10001 = i_4++;
         ints_2[i_10001] += b_11 * i_5;
         i_10001 = i_4++;
         ints_2[i_10001] += b_11 * i_6;
         b_11 = bytes_1[i_3++];
         i_10001 = i_4++;
         ints_2[i_10001] += b_11 * i_5;
         i_10001 = i_4++;
         ints_2[i_10001] += b_11 * i_6;
         b_11 = bytes_1[i_3++];
         i_10001 = i_4++;
         ints_2[i_10001] += b_11 * i_5;
         i_10001 = i_4++;
      }

      for (i_7 += 6; i_4 < i_7; ints_2[i_10001] += b_11 * i_6) {
         b_11 = bytes_1[i_3++];
         i_10001 = i_4++;
         ints_2[i_10001] += b_11 * i_5;
         i_10001 = i_4++;
      }

      class113_10.field1471 = i_3 << 8;
      return i_4 >> 1;
   }

   static int method2553(int i_0, byte[] bytes_1, int[] ints_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8, int i_9, class113 class113_10) {
      i_3 >>= 8;
      i_9 >>= 8;
      i_5 <<= 2;
      i_6 <<= 2;
      if ((i_7 = i_3 + i_4 - (i_9 - 1)) > i_8) {
         i_7 = i_8;
      }

      i_4 <<= 1;
      i_7 <<= 1;

      int i_10001;
      byte b_11;
      for (i_7 -= 6; i_4 < i_7; ints_2[i_10001] += b_11 * i_6) {
         b_11 = bytes_1[i_3--];
         i_10001 = i_4++;
         ints_2[i_10001] += b_11 * i_5;
         i_10001 = i_4++;
         ints_2[i_10001] += b_11 * i_6;
         b_11 = bytes_1[i_3--];
         i_10001 = i_4++;
         ints_2[i_10001] += b_11 * i_5;
         i_10001 = i_4++;
         ints_2[i_10001] += b_11 * i_6;
         b_11 = bytes_1[i_3--];
         i_10001 = i_4++;
         ints_2[i_10001] += b_11 * i_5;
         i_10001 = i_4++;
         ints_2[i_10001] += b_11 * i_6;
         b_11 = bytes_1[i_3--];
         i_10001 = i_4++;
         ints_2[i_10001] += b_11 * i_5;
         i_10001 = i_4++;
      }

      for (i_7 += 6; i_4 < i_7; ints_2[i_10001] += b_11 * i_6) {
         b_11 = bytes_1[i_3--];
         i_10001 = i_4++;
         ints_2[i_10001] += b_11 * i_5;
         i_10001 = i_4++;
      }

      class113_10.field1471 = i_3 << 8;
      return i_4 >> 1;
   }

   static int method2633(int i_0, int i_1, byte[] bytes_2, int[] ints_3, int i_4, int i_5, int i_6, int i_7, int i_8, int i_9, int i_10, class113 class113_11, int i_12, int i_13) {
      class113_11.field1482 -= class113_11.field1481 * i_5;
      class113_11.field1474 -= class113_11.field1468 * i_5;
      if (i_12 == 0 || (i_8 = i_5 + (i_10 - i_4 + i_12 - 257) / i_12) > i_9) {
         i_8 = i_9;
      }

      byte b_14;
      int i_10001;
      while (i_5 < i_8) {
         i_1 = i_4 >> 8;
         b_14 = bytes_2[i_1];
         i_10001 = i_5++;
         ints_3[i_10001] += ((b_14 << 8) + (bytes_2[i_1 + 1] - b_14) * (i_4 & 0xff)) * i_6 >> 6;
         i_6 += i_7;
         i_4 += i_12;
      }

      if (i_12 == 0 || (i_8 = i_5 + (i_10 - i_4 + i_12 - 1) / i_12) > i_9) {
         i_8 = i_9;
      }

      for (i_1 = i_13; i_5 < i_8; i_4 += i_12) {
         b_14 = bytes_2[i_4 >> 8];
         i_10001 = i_5++;
         ints_3[i_10001] += ((b_14 << 8) + (i_1 - b_14) * (i_4 & 0xff)) * i_6 >> 6;
         i_6 += i_7;
      }

      class113_11.field1482 += class113_11.field1481 * i_5;
      class113_11.field1474 += class113_11.field1468 * i_5;
      class113_11.field1472 = i_6;
      class113_11.field1471 = i_4;
      return i_5;
   }

   static int method2569(int i_0, int i_1, byte[] bytes_2, int[] ints_3, int i_4, int i_5, int i_6, int i_7, int i_8, int i_9, int i_10, class113 class113_11, int i_12, int i_13) {
      class113_11.field1482 -= class113_11.field1481 * i_5;
      class113_11.field1474 -= class113_11.field1468 * i_5;
      if (i_12 == 0 || (i_8 = i_5 + (i_10 + 256 - i_4 + i_12) / i_12) > i_9) {
         i_8 = i_9;
      }

      int i_10001;
      while (i_5 < i_8) {
         i_1 = i_4 >> 8;
         byte b_14 = bytes_2[i_1 - 1];
         i_10001 = i_5++;
         ints_3[i_10001] += ((b_14 << 8) + (bytes_2[i_1] - b_14) * (i_4 & 0xff)) * i_6 >> 6;
         i_6 += i_7;
         i_4 += i_12;
      }

      if (i_12 == 0 || (i_8 = i_5 + (i_10 - i_4 + i_12) / i_12) > i_9) {
         i_8 = i_9;
      }

      i_0 = i_13;

      for (i_1 = i_12; i_5 < i_8; i_4 += i_1) {
         i_10001 = i_5++;
         ints_3[i_10001] += ((i_0 << 8) + (bytes_2[i_4 >> 8] - i_0) * (i_4 & 0xff)) * i_6 >> 6;
         i_6 += i_7;
      }

      class113_11.field1482 += class113_11.field1481 * i_5;
      class113_11.field1474 += class113_11.field1468 * i_5;
      class113_11.field1472 = i_6;
      class113_11.field1471 = i_4;
      return i_5;
   }

   static int method2586(byte[] bytes_0, int[] ints_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8, class113 class113_9) {
      i_2 >>= 8;
      i_8 >>= 8;
      i_4 <<= 2;
      i_5 <<= 2;
      if ((i_6 = i_3 + i_8 - i_2) > i_7) {
         i_6 = i_7;
      }

      class113_9.field1482 += class113_9.field1481 * (i_6 - i_3);
      class113_9.field1474 += class113_9.field1468 * (i_6 - i_3);

      int i_10001;
      for (i_6 -= 3; i_3 < i_6; i_4 += i_5) {
         i_10001 = i_3++;
         ints_1[i_10001] += bytes_0[i_2++] * i_4;
         i_4 += i_5;
         i_10001 = i_3++;
         ints_1[i_10001] += bytes_0[i_2++] * i_4;
         i_4 += i_5;
         i_10001 = i_3++;
         ints_1[i_10001] += bytes_0[i_2++] * i_4;
         i_4 += i_5;
         i_10001 = i_3++;
         ints_1[i_10001] += bytes_0[i_2++] * i_4;
      }

      for (i_6 += 3; i_3 < i_6; i_4 += i_5) {
         i_10001 = i_3++;
         ints_1[i_10001] += bytes_0[i_2++] * i_4;
      }

      class113_9.field1472 = i_4 >> 2;
      class113_9.field1471 = i_2 << 8;
      return i_3;
   }

   static int method2560(byte[] bytes_0, int[] ints_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8, class113 class113_9) {
      i_2 >>= 8;
      i_8 >>= 8;
      i_4 <<= 2;
      i_5 <<= 2;
      if ((i_6 = i_3 + i_2 - (i_8 - 1)) > i_7) {
         i_6 = i_7;
      }

      class113_9.field1482 += class113_9.field1481 * (i_6 - i_3);
      class113_9.field1474 += class113_9.field1468 * (i_6 - i_3);

      int i_10001;
      for (i_6 -= 3; i_3 < i_6; i_4 += i_5) {
         i_10001 = i_3++;
         ints_1[i_10001] += bytes_0[i_2--] * i_4;
         i_4 += i_5;
         i_10001 = i_3++;
         ints_1[i_10001] += bytes_0[i_2--] * i_4;
         i_4 += i_5;
         i_10001 = i_3++;
         ints_1[i_10001] += bytes_0[i_2--] * i_4;
         i_4 += i_5;
         i_10001 = i_3++;
         ints_1[i_10001] += bytes_0[i_2--] * i_4;
      }

      for (i_6 += 3; i_3 < i_6; i_4 += i_5) {
         i_10001 = i_3++;
         ints_1[i_10001] += bytes_0[i_2--] * i_4;
      }

      class113_9.field1472 = i_4 >> 2;
      class113_9.field1471 = i_2 << 8;
      return i_3;
   }

   static int method2627(int i_0, int i_1, byte[] bytes_2, int[] ints_3, int i_4, int i_5, int i_6, int i_7, int i_8, int i_9, int i_10, int i_11, int i_12, class113 class113_13, int i_14, int i_15) {
      class113_13.field1472 -= i_5 * class113_13.field1480;
      if (i_14 == 0 || (i_10 = i_5 + (i_12 - i_4 + i_14 - 257) / i_14) > i_11) {
         i_10 = i_11;
      }

      i_5 <<= 1;

      byte b_16;
      int i_10001;
      for (i_10 <<= 1; i_5 < i_10; i_4 += i_14) {
         i_1 = i_4 >> 8;
         b_16 = bytes_2[i_1];
         i_0 = (b_16 << 8) + (i_4 & 0xff) * (bytes_2[i_1 + 1] - b_16);
         i_10001 = i_5++;
         ints_3[i_10001] += i_0 * i_6 >> 6;
         i_6 += i_8;
         i_10001 = i_5++;
         ints_3[i_10001] += i_0 * i_7 >> 6;
         i_7 += i_9;
      }

      if (i_14 == 0 || (i_10 = (i_5 >> 1) + (i_12 - i_4 + i_14 - 1) / i_14) > i_11) {
         i_10 = i_11;
      }

      i_10 <<= 1;

      for (i_1 = i_15; i_5 < i_10; i_4 += i_14) {
         b_16 = bytes_2[i_4 >> 8];
         i_0 = (b_16 << 8) + (i_1 - b_16) * (i_4 & 0xff);
         i_10001 = i_5++;
         ints_3[i_10001] += i_0 * i_6 >> 6;
         i_6 += i_8;
         i_10001 = i_5++;
         ints_3[i_10001] += i_0 * i_7 >> 6;
         i_7 += i_9;
      }

      i_5 >>= 1;
      class113_13.field1472 += class113_13.field1480 * i_5;
      class113_13.field1482 = i_6;
      class113_13.field1474 = i_7;
      class113_13.field1471 = i_4;
      return i_5;
   }

   static int method2605(int i_0, int i_1, byte[] bytes_2, int[] ints_3, int i_4, int i_5, int i_6, int i_7, int i_8, int i_9, int i_10, int i_11, int i_12, class113 class113_13, int i_14, int i_15) {
      class113_13.field1472 -= i_5 * class113_13.field1480;
      if (i_14 == 0 || (i_10 = i_5 + (i_12 + 256 - i_4 + i_14) / i_14) > i_11) {
         i_10 = i_11;
      }

      i_5 <<= 1;

      int i_10001;
      for (i_10 <<= 1; i_5 < i_10; i_4 += i_14) {
         i_1 = i_4 >> 8;
         byte b_16 = bytes_2[i_1 - 1];
         i_0 = (bytes_2[i_1] - b_16) * (i_4 & 0xff) + (b_16 << 8);
         i_10001 = i_5++;
         ints_3[i_10001] += i_0 * i_6 >> 6;
         i_6 += i_8;
         i_10001 = i_5++;
         ints_3[i_10001] += i_0 * i_7 >> 6;
         i_7 += i_9;
      }

      if (i_14 == 0 || (i_10 = (i_5 >> 1) + (i_12 - i_4 + i_14) / i_14) > i_11) {
         i_10 = i_11;
      }

      i_10 <<= 1;

      for (i_1 = i_15; i_5 < i_10; i_4 += i_14) {
         i_0 = (i_1 << 8) + (i_4 & 0xff) * (bytes_2[i_4 >> 8] - i_1);
         i_10001 = i_5++;
         ints_3[i_10001] += i_0 * i_6 >> 6;
         i_6 += i_8;
         i_10001 = i_5++;
         ints_3[i_10001] += i_0 * i_7 >> 6;
         i_7 += i_9;
      }

      i_5 >>= 1;
      class113_13.field1472 += class113_13.field1480 * i_5;
      class113_13.field1482 = i_6;
      class113_13.field1474 = i_7;
      class113_13.field1471 = i_4;
      return i_5;
   }

   static int method2559(int i_0, byte[] bytes_1, int[] ints_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8, int i_9, int i_10, int i_11, class113 class113_12) {
      i_3 >>= 8;
      i_11 >>= 8;
      i_5 <<= 2;
      i_6 <<= 2;
      i_7 <<= 2;
      i_8 <<= 2;
      if ((i_9 = i_11 + i_4 - i_3) > i_10) {
         i_9 = i_10;
      }

      class113_12.field1472 += class113_12.field1480 * (i_9 - i_4);
      i_4 <<= 1;
      i_9 <<= 1;

      byte b_13;
      int i_10001;
      for (i_9 -= 6; i_4 < i_9; i_6 += i_8) {
         b_13 = bytes_1[i_3++];
         i_10001 = i_4++;
         ints_2[i_10001] += b_13 * i_5;
         i_5 += i_7;
         i_10001 = i_4++;
         ints_2[i_10001] += b_13 * i_6;
         i_6 += i_8;
         b_13 = bytes_1[i_3++];
         i_10001 = i_4++;
         ints_2[i_10001] += b_13 * i_5;
         i_5 += i_7;
         i_10001 = i_4++;
         ints_2[i_10001] += b_13 * i_6;
         i_6 += i_8;
         b_13 = bytes_1[i_3++];
         i_10001 = i_4++;
         ints_2[i_10001] += b_13 * i_5;
         i_5 += i_7;
         i_10001 = i_4++;
         ints_2[i_10001] += b_13 * i_6;
         i_6 += i_8;
         b_13 = bytes_1[i_3++];
         i_10001 = i_4++;
         ints_2[i_10001] += b_13 * i_5;
         i_5 += i_7;
         i_10001 = i_4++;
         ints_2[i_10001] += b_13 * i_6;
      }

      for (i_9 += 6; i_4 < i_9; i_6 += i_8) {
         b_13 = bytes_1[i_3++];
         i_10001 = i_4++;
         ints_2[i_10001] += b_13 * i_5;
         i_5 += i_7;
         i_10001 = i_4++;
         ints_2[i_10001] += b_13 * i_6;
      }

      class113_12.field1482 = i_5 >> 2;
      class113_12.field1474 = i_6 >> 2;
      class113_12.field1471 = i_3 << 8;
      return i_4 >> 1;
   }

   static int method2561(int i_0, byte[] bytes_1, int[] ints_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8, int i_9, int i_10, int i_11, class113 class113_12) {
      i_3 >>= 8;
      i_11 >>= 8;
      i_5 <<= 2;
      i_6 <<= 2;
      i_7 <<= 2;
      i_8 <<= 2;
      if ((i_9 = i_3 + i_4 - (i_11 - 1)) > i_10) {
         i_9 = i_10;
      }

      class113_12.field1472 += class113_12.field1480 * (i_9 - i_4);
      i_4 <<= 1;
      i_9 <<= 1;

      byte b_13;
      int i_10001;
      for (i_9 -= 6; i_4 < i_9; i_6 += i_8) {
         b_13 = bytes_1[i_3--];
         i_10001 = i_4++;
         ints_2[i_10001] += b_13 * i_5;
         i_5 += i_7;
         i_10001 = i_4++;
         ints_2[i_10001] += b_13 * i_6;
         i_6 += i_8;
         b_13 = bytes_1[i_3--];
         i_10001 = i_4++;
         ints_2[i_10001] += b_13 * i_5;
         i_5 += i_7;
         i_10001 = i_4++;
         ints_2[i_10001] += b_13 * i_6;
         i_6 += i_8;
         b_13 = bytes_1[i_3--];
         i_10001 = i_4++;
         ints_2[i_10001] += b_13 * i_5;
         i_5 += i_7;
         i_10001 = i_4++;
         ints_2[i_10001] += b_13 * i_6;
         i_6 += i_8;
         b_13 = bytes_1[i_3--];
         i_10001 = i_4++;
         ints_2[i_10001] += b_13 * i_5;
         i_5 += i_7;
         i_10001 = i_4++;
         ints_2[i_10001] += b_13 * i_6;
      }

      for (i_9 += 6; i_4 < i_9; i_6 += i_8) {
         b_13 = bytes_1[i_3--];
         i_10001 = i_4++;
         ints_2[i_10001] += b_13 * i_5;
         i_5 += i_7;
         i_10001 = i_4++;
         ints_2[i_10001] += b_13 * i_6;
      }

      class113_12.field1482 = i_5 >> 2;
      class113_12.field1474 = i_6 >> 2;
      class113_12.field1471 = i_3 << 8;
      return i_4 >> 1;
   }

   public static class113 method2524(RawSound rawSound_0, int i_1, int i_2, int i_3) {
      return rawSound_0.field1390 != null && rawSound_0.field1390.length != 0 ? new class113(rawSound_0, i_1, i_2, i_3) : null;
   }

   public static class113 method2529(RawSound rawSound_0, int i_1, int i_2) {
      return rawSound_0.field1390 != null && rawSound_0.field1390.length != 0 ? new class113(rawSound_0, (int)((long) rawSound_0.sampleRate * 256L * (long)i_1 / (long)(CollisionMap.field2078 * 100)), i_2 << 6) : null;
   }

}
