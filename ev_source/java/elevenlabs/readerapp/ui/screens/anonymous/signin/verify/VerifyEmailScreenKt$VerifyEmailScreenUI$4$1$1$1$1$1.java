package io.elevenlabs.readerapp.ui.screens.anonymous.signin.verify;

import android.content.ClipData;
import android.os.Parcel;
import android.text.Annotation;
import android.text.Spanned;
import android.util.Base64;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import e5.l;
import e5.p;
import h5.o;
import i4.e1;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;
import n1.s3;
import p3.a1;
import p3.x;
import s4.h;
import s4.p0;
import sn.z;
import tn.n;
import u2.z0;
import w4.a0;
import w4.b0;
import w4.g0;
import w4.u;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class VerifyEmailScreenKt$VerifyEmailScreenUI$4$1$1$1$1$1 implements PointerInputEventHandler {
    final /* synthetic */ e1 $clipboardManager;
    final /* synthetic */ z0 $input$delegate;

    public VerifyEmailScreenKt$VerifyEmailScreenUI$4$1$1$1$1$1(e1 e1Var, z0 z0Var) {
        this.$clipboardManager = e1Var;
        this.$input$delegate = z0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00cc, code lost:
    
        r44 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0159, code lost:
    
        if (r2 == 2) goto L248;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final z invoke$lambda$0(e1 e1Var, z0 z0Var, o3.b bVar) {
        h hVar;
        String VerifyEmailScreenUI$lambda$3$0$0$0$2;
        String str;
        CharSequence charSequence;
        Spanned spanned;
        l lVar;
        long j4;
        long T;
        long j10;
        long T2;
        ClipData primaryClip = ((i4.h) e1Var).f13090a.getPrimaryClip();
        int i10 = 0;
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            ClipData.Item itemAt = primaryClip.getItemAt(0);
            if (itemAt != null) {
                charSequence = itemAt.getText();
            } else {
                charSequence = null;
            }
            if (charSequence != null) {
                if (!(charSequence instanceof Spanned)) {
                    hVar = new h(charSequence.toString());
                } else {
                    Spanned spanned2 = (Spanned) charSequence;
                    Annotation[] annotationArr = (Annotation[]) spanned2.getSpans(0, spanned2.length(), Annotation.class);
                    ArrayList arrayList = new ArrayList();
                    int K0 = n.K0(annotationArr);
                    if (K0 >= 0) {
                        int i11 = 0;
                        while (true) {
                            Annotation annotation = annotationArr[i11];
                            if (!m.c(annotation.getKey(), "androidx.compose.text.SpanStyle")) {
                                spanned = spanned2;
                            } else {
                                int spanStart = spanned2.getSpanStart(annotation);
                                int spanEnd = spanned2.getSpanEnd(annotation);
                                String value = annotation.getValue();
                                Parcel obtain = Parcel.obtain();
                                byte[] decode = Base64.decode(value, i10);
                                obtain.unmarshall(decode, i10, decode.length);
                                obtain.setDataPosition(i10);
                                long j11 = x.f26438m;
                                long j12 = j11;
                                long j13 = o.f12098c;
                                long j14 = j13;
                                g0 g0Var = null;
                                a0 a0Var = null;
                                b0 b0Var = null;
                                String str2 = null;
                                e5.a aVar = null;
                                p pVar = null;
                                l lVar2 = null;
                                a1 a1Var = null;
                                while (true) {
                                    int i12 = 1;
                                    if (obtain.dataAvail() <= 1) {
                                        break;
                                    }
                                    byte readByte = obtain.readByte();
                                    if (readByte == 1) {
                                        if (obtain.dataAvail() < 8) {
                                            break;
                                        }
                                        int i13 = x.f26439n;
                                        j11 = obtain.readLong();
                                        long j15 = j11 & 63;
                                        if (j15 >= 16) {
                                            j11 = (j11 & (-64)) | (j15 + 1);
                                        }
                                    } else {
                                        spanned = spanned2;
                                        if (readByte == 2) {
                                            if (obtain.dataAvail() < 5) {
                                                break;
                                            }
                                            byte readByte2 = obtain.readByte();
                                            if (readByte2 == 1) {
                                                j10 = 4294967296L;
                                            } else if (readByte2 == 2) {
                                                j10 = 8589934592L;
                                            } else {
                                                j10 = 0;
                                            }
                                            if (h5.p.a(j10, 0L)) {
                                                T2 = o.f12098c;
                                            } else {
                                                T2 = ae.l.T(obtain.readFloat(), j10);
                                            }
                                            j13 = T2;
                                            spanned2 = spanned;
                                        } else if (readByte == 3) {
                                            if (obtain.dataAvail() < 4) {
                                                break;
                                            }
                                            g0Var = new g0(obtain.readInt());
                                            spanned2 = spanned;
                                        } else if (readByte == 4) {
                                            if (obtain.dataAvail() < 1) {
                                                break;
                                            }
                                            byte readByte3 = obtain.readByte();
                                            if (readByte3 == 0 || readByte3 != 1) {
                                                i12 = 0;
                                            }
                                            a0Var = new a0(i12);
                                            spanned2 = spanned;
                                        } else if (readByte == 5) {
                                            if (obtain.dataAvail() < 1) {
                                                break;
                                            }
                                            byte readByte4 = obtain.readByte();
                                            if (readByte4 != 0) {
                                                if (readByte4 == 1) {
                                                    i12 = 65535;
                                                } else if (readByte4 == 3) {
                                                    i12 = 2;
                                                }
                                                b0Var = new b0(i12);
                                                spanned2 = spanned;
                                            }
                                            i12 = 0;
                                            b0Var = new b0(i12);
                                            spanned2 = spanned;
                                        } else {
                                            if (readByte == 6) {
                                                str2 = obtain.readString();
                                            } else if (readByte == 7) {
                                                if (obtain.dataAvail() < 5) {
                                                    break;
                                                }
                                                byte readByte5 = obtain.readByte();
                                                if (readByte5 == 1) {
                                                    j4 = 4294967296L;
                                                } else if (readByte5 == 2) {
                                                    j4 = 8589934592L;
                                                } else {
                                                    j4 = 0;
                                                }
                                                if (h5.p.a(j4, 0L)) {
                                                    T = o.f12098c;
                                                } else {
                                                    T = ae.l.T(obtain.readFloat(), j4);
                                                }
                                                j14 = T;
                                            } else if (readByte == 8) {
                                                if (obtain.dataAvail() < 4) {
                                                    break;
                                                }
                                                aVar = new e5.a(obtain.readFloat());
                                            } else if (readByte == 9) {
                                                if (obtain.dataAvail() < 8) {
                                                    break;
                                                }
                                                pVar = new p(obtain.readFloat(), obtain.readFloat());
                                            } else if (readByte == 10) {
                                                if (obtain.dataAvail() < 8) {
                                                    break;
                                                }
                                                int i14 = x.f26439n;
                                                long readLong = obtain.readLong();
                                                long j16 = readLong & 63;
                                                if (j16 >= 16) {
                                                    readLong = (readLong & (-64)) | (j16 + 1);
                                                }
                                                j12 = readLong;
                                            } else if (readByte == 11) {
                                                if (obtain.dataAvail() < 4) {
                                                    break;
                                                }
                                                int readInt = obtain.readInt();
                                                if ((readInt | 3) != 3) {
                                                    z4.a.a("The given mask=" + readInt + " is not recognized by TextDecoration.");
                                                }
                                                if (readInt != 0) {
                                                    if (readInt != 1) {
                                                        if (readInt != 2) {
                                                            lVar2 = new l(readInt);
                                                        } else {
                                                            lVar = l.f8291d;
                                                        }
                                                    } else {
                                                        lVar = l.f8290c;
                                                    }
                                                } else {
                                                    lVar = l.f8289b;
                                                }
                                                lVar2 = lVar;
                                            } else if (readByte == 12) {
                                                if (obtain.dataAvail() < 20) {
                                                    break;
                                                }
                                                int i15 = x.f26439n;
                                                long readLong2 = obtain.readLong();
                                                long j17 = readLong2 & 63;
                                                if (j17 >= 16) {
                                                    readLong2 = (readLong2 & (-64)) | (j17 + 1);
                                                }
                                                spanned2 = spanned;
                                                a1Var = new a1(readLong2, (Float.floatToRawIntBits(obtain.readFloat()) << 32) | (Float.floatToRawIntBits(obtain.readFloat()) & 4294967295L), obtain.readFloat());
                                            }
                                            spanned2 = spanned;
                                        }
                                    }
                                }
                                arrayList.add(new s4.f(new p0(j11, j13, g0Var, a0Var, b0Var, (u) null, str2, j14, aVar, pVar, (a5.c) null, j12, lVar2, a1Var, 49152), spanStart, spanEnd));
                            }
                            if (i11 == K0) {
                                break;
                            }
                            i11++;
                            spanned2 = spanned;
                            i10 = 0;
                        }
                    }
                    hVar = new h(4, charSequence.toString(), arrayList);
                }
                if (hVar != null || (str = hVar.f31041b) == null) {
                    VerifyEmailScreenUI$lambda$3$0$0$0$2 = VerifyEmailScreenKt.VerifyEmailScreenUI$lambda$3$0$0$0$2(z0Var);
                } else {
                    StringBuilder sb = new StringBuilder();
                    int length = str.length();
                    for (int i16 = 0; i16 < length; i16++) {
                        char charAt = str.charAt(i16);
                        if (Character.isDigit(charAt)) {
                            sb.append(charAt);
                        }
                    }
                    VerifyEmailScreenUI$lambda$3$0$0$0$2 = sb.toString();
                }
                z0Var.setValue(VerifyEmailScreenUI$lambda$3$0$0$0$2);
                return z.f31622a;
            }
        }
        hVar = null;
        if (hVar != null) {
        }
        VerifyEmailScreenUI$lambda$3$0$0$0$2 = VerifyEmailScreenKt.VerifyEmailScreenUI$lambda$3$0$0$0$2(z0Var);
        z0Var.setValue(VerifyEmailScreenUI$lambda$3$0$0$0$2);
        return z.f31622a;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(c4.a0 a0Var, wn.c<? super z> cVar) {
        Object d10 = s3.d(a0Var, new e(this.$clipboardManager, this.$input$delegate, 0), null, null, cVar, 13);
        if (d10 == xn.a.f37986a) {
            return d10;
        }
        return z.f31622a;
    }
}
