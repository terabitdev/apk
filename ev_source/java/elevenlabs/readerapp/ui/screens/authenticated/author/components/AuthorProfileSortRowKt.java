package io.elevenlabs.readerapp.ui.screens.authenticated.author.components;

import a2.d0;
import c3.k;
import c3.o;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import f4.f1;
import h4.f;
import h4.g;
import h4.h;
import ho.l;
import i3.a;
import i3.d;
import i3.t;
import ib.i;
import io.elevenlabs.ui.R;
import io.elevenlabs.ui.components.ButtonIconKt;
import io.elevenlabs.ui.components.ButtonIconSize;
import io.elevenlabs.ui.components.ButtonIconVariant;
import io.elevenlabs.ui.components.MenuKt;
import io.elevenlabs.ui.theme.ElevenLabsTheme;
import io.elevenlabs.ui.theme.ElevenLabsThemeKt;
import io.livekit.android.rpc.RpcError;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kj.c;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import q2.j7;
import r1.i2;
import r1.j;
import r1.k2;
import r1.m1;
import r1.p;
import r1.p2;
import r1.u0;
import s4.y0;
import sn.z;
import t2.u;
import u2.e;
import u2.m;
import u2.q;
import u2.r;
import u2.r1;
import u2.z0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000(\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u001aS\u0010\n\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00002\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\n\u0010\u000b\u001aI\u0010\f\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\t\u001a\u00020\bH\u0003¢\u0006\u0004\b\f\u0010\r\u001a\u000f\u0010\u000e\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u000f\u0010\u0010\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0010\u0010\u000f¨\u0006\u0013²\u0006\u000e\u0010\u0012\u001a\u00020\u00118\n@\nX\u008a\u008e\u0002"}, d2 = {"", "currentSortKey", "", "availableSortOptions", "currentSubpageCountLabel", "Lkotlin/Function1;", "Lsn/z;", "onSortChange", "Li3/t;", "modifier", "AuthorProfileSortRow", "(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Lho/l;Li3/t;Lu2/m;II)V", "AuthorProfileSortButton", "(Ljava/lang/String;Ljava/util/Map;Lho/l;Li3/t;Lu2/m;II)V", "Preview_AuthorProfileSortRow", "(Lu2/m;I)V", "Preview_AuthorProfileSortRow_NoCount", "", "menuExpanded", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class AuthorProfileSortRowKt {
    /* JADX WARN: Removed duplicated region for block: B:25:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void AuthorProfileSortButton(String str, Map<String, String> map, l lVar, t tVar, m mVar, int i10, int i11) {
        int i12;
        Map<String, String> map2;
        l lVar2;
        t tVar2;
        int i13;
        boolean z6;
        q qVar;
        t tVar3;
        r1 r10;
        t tVar4;
        int i14;
        int i15;
        int i16;
        q qVar2 = (q) mVar;
        qVar2.Z(-1638160225);
        String str2 = str;
        if ((i10 & 6) == 0) {
            if (qVar2.f(str2)) {
                i16 = 4;
            } else {
                i16 = 2;
            }
            i12 = i16 | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            map2 = map;
            if (qVar2.h(map2)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i12 |= i15;
        } else {
            map2 = map;
        }
        if ((i10 & 384) == 0) {
            lVar2 = lVar;
            if (qVar2.h(lVar2)) {
                i14 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i14 = 128;
            }
            i12 |= i14;
        } else {
            lVar2 = lVar;
        }
        int i17 = i11 & 8;
        if (i17 != 0) {
            i12 |= 3072;
        } else if ((i10 & 3072) == 0) {
            tVar2 = tVar;
            if (qVar2.f(tVar2)) {
                i13 = 2048;
            } else {
                i13 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i12 |= i13;
            if ((i12 & 1171) == 1170) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (!qVar2.O(i12 & 1, z6)) {
                if (i17 != 0) {
                    tVar4 = i3.q.f13017a;
                } else {
                    tVar4 = tVar2;
                }
                f1 d10 = p.d(d.f12997a, false);
                int hashCode = Long.hashCode(qVar2.T);
                o l4 = qVar2.l();
                t c5 = a.c(tVar4, qVar2);
                h.f11920i.getClass();
                f fVar = g.f11903b;
                qVar2.b0();
                if (qVar2.S) {
                    qVar2.k(fVar);
                } else {
                    qVar2.k0();
                }
                r.J(g.f11907f, d10, qVar2);
                r.J(g.f11906e, l4, qVar2);
                r.y(qVar2, Integer.valueOf(hashCode), g.f11908g);
                r.F(g.f11909h, qVar2);
                r.J(g.f11905d, c5, qVar2);
                Object L = qVar2.L();
                e eVar = u2.l.f33918a;
                if (L == eVar) {
                    L = r.A(Boolean.FALSE);
                    qVar2.h0(L);
                }
                z0 z0Var = (z0) L;
                int i18 = R.drawable.filter_desc;
                String R = c.R(qVar2, io.elevenlabs.readerapp.R.string.library_accessibility_options);
                ButtonIconSize buttonIconSize = ButtonIconSize.Medium;
                ButtonIconVariant buttonIconVariant = ButtonIconVariant.Secondary;
                Object L2 = qVar2.L();
                if (L2 == eVar) {
                    L2 = new d0(z0Var, 22);
                    qVar2.h0(L2);
                }
                t tVar5 = tVar4;
                ButtonIconKt.ButtonIcon(i18, R, (ho.a) L2, null, buttonIconVariant, buttonIconSize, false, false, false, qVar2, 221568, 456);
                boolean AuthorProfileSortButton$lambda$0$1 = AuthorProfileSortButton$lambda$0$1(z0Var);
                Object L3 = qVar2.L();
                if (L3 == eVar) {
                    L3 = new d0(z0Var, 23);
                    qVar2.h0(L3);
                }
                ho.a aVar = (ho.a) L3;
                qVar2.X(-358041884);
                List Z0 = tn.o.Z0(map2.keySet());
                ArrayList arrayList = new ArrayList(tn.p.a0(Z0, 10));
                Iterator it = Z0.iterator();
                while (it.hasNext()) {
                    arrayList.add(k.d(-556537805, true, new f2.o(map2, (String) it.next(), str2, lVar2, z0Var), qVar2));
                    str2 = str;
                    map2 = map;
                    lVar2 = lVar;
                }
                qVar2.p(false);
                MenuKt.m1842MenuILWXrKs(AuthorProfileSortButton$lambda$0$1, aVar, null, 0L, null, arrayList, qVar2, 48, 28);
                qVar = qVar2;
                qVar.p(true);
                tVar3 = tVar5;
            } else {
                qVar = qVar2;
                qVar.R();
                tVar3 = tVar2;
            }
            r10 = qVar.r();
            if (r10 == null) {
                r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.voices.f(str, map, lVar, tVar3, i10, i11, 11);
                return;
            }
            return;
        }
        tVar2 = tVar;
        if ((i12 & 1171) == 1170) {
        }
        if (!qVar2.O(i12 & 1, z6)) {
        }
        r10 = qVar.r();
        if (r10 == null) {
        }
    }

    private static final boolean AuthorProfileSortButton$lambda$0$1(z0 z0Var) {
        return ((Boolean) z0Var.getValue()).booleanValue();
    }

    private static final void AuthorProfileSortButton$lambda$0$2(z0 z0Var, boolean z6) {
        z0Var.setValue(Boolean.valueOf(z6));
    }

    public static final z AuthorProfileSortButton$lambda$0$3$0(z0 z0Var) {
        AuthorProfileSortButton$lambda$0$2(z0Var, true);
        return z.f31622a;
    }

    public static final z AuthorProfileSortButton$lambda$0$4$0(z0 z0Var) {
        AuthorProfileSortButton$lambda$0$2(z0Var, false);
        return z.f31622a;
    }

    public static final z AuthorProfileSortButton$lambda$0$5$0(Map map, String str, String str2, l lVar, z0 z0Var, m mVar, int i10) {
        boolean z6;
        String str3;
        Integer num;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            String str4 = (String) map.get(str);
            if (str4 == null) {
                str3 = str;
            } else {
                str3 = str4;
            }
            if (kotlin.jvm.internal.m.c(str2, str)) {
                num = Integer.valueOf(R.drawable.check);
            } else {
                num = null;
            }
            Integer num2 = num;
            boolean f10 = qVar.f(lVar) | qVar.f(str);
            Object L = qVar.L();
            if (f10 || L == u2.l.f33918a) {
                L = new io.elevenlabs.readerapp.ui.screens.authenticated.voices.m(lVar, (Object) str, (Object) z0Var, 1);
                qVar.h0(L);
            }
            MenuKt.MenuItem((ho.a) L, false, str3, num2, false, false, qVar, 0, 50);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z AuthorProfileSortButton$lambda$0$5$0$0$0(l lVar, String str, z0 z0Var) {
        AuthorProfileSortButton$lambda$0$2(z0Var, false);
        lVar.invoke(str);
        return z.f31622a;
    }

    public static final z AuthorProfileSortButton$lambda$1(String str, Map map, l lVar, t tVar, int i10, int i11, m mVar, int i12) {
        AuthorProfileSortButton(str, map, lVar, tVar, mVar, r.M(i10 | 1), i11);
        return z.f31622a;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AuthorProfileSortRow(String str, Map<String, String> map, String str2, l lVar, t tVar, m mVar, int i10, int i11) {
        int i12;
        t tVar2;
        int i13;
        boolean z6;
        t tVar3;
        r1 r10;
        t tVar4;
        int i14;
        t tVar5;
        boolean z10;
        int i15;
        int i16;
        int i17;
        int i18;
        str.getClass();
        map.getClass();
        lVar.getClass();
        q qVar = (q) mVar;
        qVar.Z(-218814122);
        if ((i10 & 6) == 0) {
            if (qVar.f(str)) {
                i18 = 4;
            } else {
                i18 = 2;
            }
            i12 = i18 | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar.h(map)) {
                i17 = 32;
            } else {
                i17 = 16;
            }
            i12 |= i17;
        }
        if ((i10 & 384) == 0) {
            if (qVar.f(str2)) {
                i16 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i16 = 128;
            }
            i12 |= i16;
        }
        if ((i10 & 3072) == 0) {
            if (qVar.h(lVar)) {
                i15 = 2048;
            } else {
                i15 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i12 |= i15;
        }
        int i19 = i11 & 16;
        if (i19 != 0) {
            i12 |= 24576;
        } else if ((i10 & 24576) == 0) {
            tVar2 = tVar;
            if (qVar.f(tVar2)) {
                i13 = 16384;
            } else {
                i13 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
            }
            i12 |= i13;
            if ((i12 & 9363) == 9362) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (!qVar.O(i12 & 1, z6)) {
                if (i19 != 0) {
                    tVar4 = i3.q.f13017a;
                } else {
                    tVar4 = tVar2;
                }
                t e10 = p2.e(tVar4, 1.0f);
                ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
                int i20 = ElevenLabsTheme.$stable;
                t G = r1.d.G(e10, elevenLabsTheme.getSpacings(qVar, i20).m2357getX5D9Ej5fM(), u.P, 2);
                u0 u0Var = j.f29228a;
                k2 a10 = i2.a(i.n(elevenLabsTheme, qVar, i20), d.f13005z0, qVar, 48);
                int hashCode = Long.hashCode(qVar.T);
                o l4 = qVar.l();
                t c5 = a.c(G, qVar);
                h.f11920i.getClass();
                f fVar = g.f11903b;
                qVar.b0();
                if (qVar.S) {
                    qVar.k(fVar);
                } else {
                    qVar.k0();
                }
                r.J(g.f11907f, a10, qVar);
                r.J(g.f11906e, l4, qVar);
                r.y(qVar, Integer.valueOf(hashCode), g.f11908g);
                r.F(g.f11909h, qVar);
                r.J(g.f11905d, c5, qVar);
                if (str2 != null) {
                    qVar.X(1965423621);
                    y0 bodySmall500 = elevenLabsTheme.getTypo(qVar, i20).getBodySmall500();
                    long w6 = i.w(elevenLabsTheme, qVar, i20);
                    if (1.0f <= 0.0d) {
                        s1.a.a("invalid weight; must be greater than zero");
                    }
                    i14 = i12;
                    tVar5 = tVar4;
                    j7.d(str2, new m1(1.0f, true), w6, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, bodySmall500, qVar, (i12 >> 6) & 14, 0, 131064);
                    qVar = qVar;
                    z10 = false;
                    qVar.p(false);
                } else {
                    i14 = i12;
                    tVar5 = tVar4;
                    z10 = false;
                    qVar.X(1965659376);
                    qVar.p(false);
                }
                if (!map.isEmpty()) {
                    qVar.X(1965714680);
                    AuthorProfileSortButton(str, map, lVar, null, qVar, (i14 & 126) | ((i14 >> 3) & 896), 8);
                    qVar.p(z10);
                } else {
                    qVar.X(1965922256);
                    qVar.p(z10);
                }
                qVar.p(true);
                tVar3 = tVar5;
            } else {
                qVar.R();
                tVar3 = tVar2;
            }
            r10 = qVar.r();
            if (r10 == null) {
                r10.f34012d = new io.elevenlabs.readerapp.ui.components.explore.p(str, map, str2, lVar, tVar3, i10, i11);
                return;
            }
            return;
        }
        tVar2 = tVar;
        if ((i12 & 9363) == 9362) {
        }
        if (!qVar.O(i12 & 1, z6)) {
        }
        r10 = qVar.r();
        if (r10 == null) {
        }
    }

    public static final z AuthorProfileSortRow$lambda$1(String str, Map map, String str2, l lVar, t tVar, int i10, int i11, m mVar, int i12) {
        AuthorProfileSortRow(str, map, str2, lVar, tVar, mVar, r.M(i10 | 1), i11);
        return z.f31622a;
    }

    public static final void Preview_AuthorProfileSortRow(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(-502796217);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            ElevenLabsThemeKt.ElevenLabsTheme(false, ComposableSingletons$AuthorProfileSortRowKt.INSTANCE.getLambda$2132759409$app_productionRelease(), qVar, 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new jm.a(i10, 2);
        }
    }

    public static final z Preview_AuthorProfileSortRow$lambda$0(int i10, m mVar, int i11) {
        Preview_AuthorProfileSortRow(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_AuthorProfileSortRow_NoCount(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(409128182);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            ElevenLabsThemeKt.ElevenLabsTheme(false, ComposableSingletons$AuthorProfileSortRowKt.INSTANCE.getLambda$2023843360$app_productionRelease(), qVar, 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new jm.a(i10, 1);
        }
    }

    public static final z Preview_AuthorProfileSortRow_NoCount$lambda$0(int i10, m mVar, int i11) {
        Preview_AuthorProfileSortRow_NoCount(mVar, r.M(i10 | 1));
        return z.f31622a;
    }
}
