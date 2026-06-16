package io.elevenlabs.ui.extensions;

import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import com.google.protobuf.c6;
import h4.k0;
import i3.t;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import m3.d;
import m3.h;
import m3.i;
import p3.b1;
import p3.g;
import p3.h0;
import p3.k;
import p3.p0;
import p3.q0;
import p3.r0;
import p3.s0;
import p3.v;
import p3.v0;
import p3.x;
import p3.y;
import sn.z;
import t2.u;
import u2.l;
import u2.m;
import u2.q;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\u001a5\u0010\b\u001a\u00020\u0000*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\b\u0010\t\u001a9\u0010\b\u001a\u00020\u0000*\u00020\u00002\u0012\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\n\"\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\u000b\u001a%\u0010\u000f\u001a\u00020\u000e*\u00020\f2\u0006\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a%\u0010\u0018\u001a\u00020\u000e*\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Li3/t;", "", "Lio/elevenlabs/ui/extensions/BoxShadow;", "shadowList", "Lp3/b1;", "shape", "", "clip", "boxShadow", "(Li3/t;Ljava/util/List;Lp3/b1;ZLu2/m;II)Li3/t;", "", "(Li3/t;[Lio/elevenlabs/ui/extensions/BoxShadow;Lp3/b1;Z)Li3/t;", "Lr3/c;", "shadow", "Lsn/z;", "drawShadow", "(Lr3/c;Lio/elevenlabs/ui/extensions/BoxShadow;Lp3/b1;)V", "Lp3/v;", "Lp3/s0;", "outline", "", "clipOp", "clipToOutline-3CRKOt0", "(Lp3/v;Lp3/s0;I)V", "clipToOutline", "ui_release"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class BoxShadowKt {
    public static final t boxShadow(t tVar, List<BoxShadow> list, b1 b1Var, boolean z6, m mVar, int i10, int i11) {
        tVar.getClass();
        list.getClass();
        if ((i11 & 2) != 0) {
            b1Var = h0.f26395b;
        }
        if ((i11 & 4) != 0) {
            z6 = true;
        }
        q qVar = (q) mVar;
        boolean f10 = qVar.f(list);
        Object L = qVar.L();
        if (f10 || L == l.f33918a) {
            L = (BoxShadow[]) list.toArray(new BoxShadow[0]);
            qVar.h0(L);
        }
        BoxShadow[] boxShadowArr = (BoxShadow[]) L;
        return boxShadow(tVar, (BoxShadow[]) Arrays.copyOf(boxShadowArr, boxShadowArr.length), b1Var, z6);
    }

    public static /* synthetic */ t boxShadow$default(t tVar, BoxShadow[] boxShadowArr, b1 b1Var, boolean z6, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            b1Var = h0.f26395b;
        }
        if ((i10 & 4) != 0) {
            z6 = true;
        }
        return boxShadow(tVar, boxShadowArr, b1Var, z6);
    }

    public static final i boxShadow$lambda$1(BoxShadow[] boxShadowArr, b1 b1Var, d dVar) {
        dVar.getClass();
        return dVar.a(new a(boxShadowArr, b1Var, 0));
    }

    public static final z boxShadow$lambda$1$0(BoxShadow[] boxShadowArr, b1 b1Var, r3.c cVar) {
        cVar.getClass();
        ArrayList arrayList = new ArrayList();
        for (BoxShadow boxShadow : boxShadowArr) {
            if (!boxShadow.getInset()) {
                arrayList.add(boxShadow);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            drawShadow(cVar, (BoxShadow) it.next(), b1Var);
        }
        ((k0) cVar).a();
        ArrayList arrayList2 = new ArrayList();
        for (BoxShadow boxShadow2 : boxShadowArr) {
            if (boxShadow2.getInset()) {
                arrayList2.add(boxShadow2);
            }
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            drawShadow(cVar, (BoxShadow) it2.next(), b1Var);
        }
        return z.f31622a;
    }

    /* renamed from: clipToOutline-3CRKOt0 */
    private static final void m1977clipToOutline3CRKOt0(v vVar, s0 s0Var, int i10) {
        if (s0Var instanceof p0) {
            vVar.k(((p0) s0Var).f26415a, i10);
            return;
        }
        if (s0Var instanceof q0) {
            o3.c cVar = ((q0) s0Var).f26417a;
            vVar.getClass();
            vVar.d(cVar.f24766a, cVar.f24767b, cVar.f24768c, cVar.f24769d, i10);
        } else {
            if (s0Var instanceof r0) {
                p3.i a10 = k.a();
                v0.c(a10, ((r0) s0Var).f26421a);
                vVar.k(a10, i10);
                return;
            }
            c6.p();
        }
    }

    /* renamed from: clipToOutline-3CRKOt0$default */
    public static /* synthetic */ void m1978clipToOutline3CRKOt0$default(v vVar, s0 s0Var, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 1;
        }
        m1977clipToOutline3CRKOt0(vVar, s0Var, i10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v28, types: [p3.z, p3.y] */
    private static final void drawShadow(r3.c cVar, BoxShadow boxShadow, b1 b1Var) {
        boolean z6;
        float f10;
        k0 k0Var;
        char c5;
        long b10;
        s0 s0Var;
        long m1972getColor0d7_KjU = boxShadow.m1972getColor0d7_KjU();
        float m1971getBlurRadiusD9Ej5fM = boxShadow.m1971getBlurRadiusD9Ej5fM();
        float m1974getSpreadRadiusD9Ej5fM = boxShadow.m1974getSpreadRadiusD9Ej5fM();
        long m1973getOffsetRKDOV3M = boxShadow.m1973getOffsetRKDOV3M();
        boolean inset = boxShadow.getInset();
        if (m1972getColor0d7_KjU != 16) {
            if (!Float.isNaN(m1971getBlurRadiusD9Ej5fM)) {
                if (m1971getBlurRadiusD9Ej5fM >= u.P) {
                    if (!Float.isNaN(m1974getSpreadRadiusD9Ej5fM)) {
                        if (m1973getOffsetRKDOV3M != 9205357640488583168L) {
                            v y10 = ((k0) cVar).f11967a.f29421b.y();
                            k0 k0Var2 = (k0) cVar;
                            float d02 = k0Var2.d0(m1974getSpreadRadiusD9Ej5fM);
                            r3.b bVar = k0Var2.f11967a;
                            if (inset) {
                                d02 = -d02;
                            }
                            if (d02 == u.P) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            if (!z6) {
                                long b11 = bVar.b();
                                c5 = 1;
                                float intBitsToFloat = Float.intBitsToFloat((int) (b11 >> 32));
                                k0Var = k0Var2;
                                float f11 = 2 * d02;
                                float intBitsToFloat2 = Float.intBitsToFloat((int) (b11 & 4294967295L)) + f11;
                                f10 = 0.0f;
                                b10 = (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat + f11) << 32);
                            } else {
                                f10 = 0.0f;
                                k0Var = k0Var2;
                                c5 = 1;
                                b10 = bVar.b();
                            }
                            k0 k0Var3 = k0Var;
                            s0 mo1createOutlinePq9zytI = b1Var.mo1createOutlinePq9zytI(b10, k0Var.getLayoutDirection(), k0Var3);
                            y10.o();
                            if (inset) {
                                if (!z6) {
                                    s0Var = b1Var.mo1createOutlinePq9zytI(bVar.b(), k0Var3.getLayoutDirection(), k0Var3);
                                } else {
                                    s0Var = mo1createOutlinePq9zytI;
                                }
                                m1978clipToOutline3CRKOt0$default(y10, s0Var, 0, 2, null);
                                o3.c a10 = s0Var.a();
                                g i10 = h0.i();
                                float d10 = x.d(m1972getColor0d7_KjU) * 255.0f;
                                float[] fArr = new float[20];
                                fArr[0] = 1.0f;
                                fArr[c5] = f10;
                                fArr[2] = f10;
                                fArr[3] = f10;
                                fArr[4] = f10;
                                fArr[5] = f10;
                                fArr[6] = 1.0f;
                                fArr[7] = f10;
                                fArr[8] = f10;
                                fArr[9] = f10;
                                fArr[10] = f10;
                                fArr[11] = f10;
                                fArr[12] = 1.0f;
                                fArr[13] = f10;
                                fArr[14] = f10;
                                fArr[15] = f10;
                                fArr[16] = f10;
                                fArr[17] = f10;
                                fArr[18] = -1.0f;
                                fArr[19] = d10;
                                ?? yVar = new y(new ColorMatrixColorFilter(fArr));
                                yVar.f26452b = fArr;
                                i10.f(yVar);
                                y10.j(a10, i10);
                            }
                            g i11 = h0.i();
                            Paint paint = i11.f26379a;
                            paint.setColor(h0.G(x.f26437l));
                            paint.setShadowLayer(k0Var3.d0(m1971getBlurRadiusD9Ej5fM), k0Var3.d0(Float.intBitsToFloat((int) (m1973getOffsetRKDOV3M >> 32))) - d02, k0Var3.d0(Float.intBitsToFloat((int) (m1973getOffsetRKDOV3M & 4294967295L))) - d02, h0.G(m1972getColor0d7_KjU));
                            if (mo1createOutlinePq9zytI instanceof q0) {
                                o3.c cVar2 = ((q0) mo1createOutlinePq9zytI).f26417a;
                                y10.b(cVar2.f24766a, cVar2.f24767b, cVar2.f24768c, cVar2.f24769d, i11);
                            } else if (mo1createOutlinePq9zytI instanceof r0) {
                                r0 r0Var = (r0) mo1createOutlinePq9zytI;
                                o3.d dVar = r0Var.f26421a;
                                v0 v0Var = r0Var.f26422b;
                                if (v0Var != null) {
                                    y10.l(v0Var, i11);
                                } else {
                                    float f12 = dVar.f24770a;
                                    long j4 = dVar.f24777h;
                                    y10.h(f12, dVar.f24771b, dVar.f24772c, dVar.f24773d, Float.intBitsToFloat((int) (j4 >> 32)), Float.intBitsToFloat((int) (j4 & 4294967295L)), i11);
                                }
                            } else if (mo1createOutlinePq9zytI instanceof p0) {
                                y10.l(((p0) mo1createOutlinePq9zytI).f26415a, i11);
                            } else {
                                c6.p();
                                return;
                            }
                            if (inset) {
                                y10.f();
                            }
                            y10.f();
                            return;
                        }
                        c6.t("offset must be specified.");
                        return;
                    }
                    c6.t("spreadRadius must be specified.");
                    return;
                }
                c6.t("blurRadius can't be negative.");
                return;
            }
            c6.t("blurRadius must be specified.");
            return;
        }
        c6.t("color must be specified.");
    }

    public static /* synthetic */ void drawShadow$default(r3.c cVar, BoxShadow boxShadow, b1 b1Var, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            b1Var = h0.f26395b;
        }
        drawShadow(cVar, boxShadow, b1Var);
    }

    public static final t boxShadow(t tVar, BoxShadow[] boxShadowArr, b1 b1Var, boolean z6) {
        tVar.getClass();
        boxShadowArr.getClass();
        b1Var.getClass();
        t f10 = h.f(tVar, new a(boxShadowArr, b1Var, 1));
        return z6 ? h.c(f10, b1Var) : f10;
    }
}
