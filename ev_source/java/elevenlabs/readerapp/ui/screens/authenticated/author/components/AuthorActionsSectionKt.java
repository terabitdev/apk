package io.elevenlabs.readerapp.ui.screens.authenticated.author.components;

import c3.o;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import h4.f;
import h4.g;
import h4.h;
import ho.a;
import ho.l;
import i3.t;
import io.elevenlabs.readerapp.R;
import io.elevenlabs.readerapp.ui.screens.authenticated.assistant.x;
import io.elevenlabs.ui.components.EchoButtonKt;
import io.elevenlabs.ui.components.EchoButtonSize;
import io.elevenlabs.ui.components.EchoButtonVariant;
import io.elevenlabs.ui.components.EchoIconButtonKt;
import io.elevenlabs.ui.components.u1;
import io.elevenlabs.ui.echo.EchoTheme;
import io.livekit.android.rpc.RpcError;
import kj.c;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import r1.d;
import r1.i2;
import r1.j;
import r1.k2;
import r1.m1;
import r1.p2;
import sn.z;
import u2.m;
import u2.q;
import u2.r;
import u2.r1;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000&\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001aS\u0010\f\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\b2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\f\u0010\r\u001a\u000f\u0010\u000e\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u000f\u0010\u0010\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0010\u0010\u000f\u001a\u000f\u0010\u0011\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0011\u0010\u000f¨\u0006\u0012"}, d2 = {"", "isFollowing", "isFollowOperationInFlight", "", "shareLink", "Lkotlin/Function0;", "Lsn/z;", "onClick", "Lkotlin/Function1;", "onShareClick", "Li3/t;", "modifier", "AuthorActionsSection", "(ZZLjava/lang/String;Lho/a;Lho/l;Li3/t;Lu2/m;II)V", "AuthorActionsSection_Preview_Following", "(Lu2/m;I)V", "AuthorActionsSection_Preview_NotFollowing", "AuthorActionsSection_Preview_Loading", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class AuthorActionsSectionKt {
    /* JADX WARN: Removed duplicated region for block: B:39:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AuthorActionsSection(boolean z6, boolean z10, String str, a aVar, l lVar, t tVar, m mVar, int i10, int i11) {
        int i12;
        boolean z11;
        a aVar2;
        t tVar2;
        int i13;
        boolean z12;
        q qVar;
        t tVar3;
        r1 r10;
        t tVar4;
        int i14;
        EchoButtonVariant echoButtonVariant;
        int i15;
        boolean z13;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        str.getClass();
        aVar.getClass();
        lVar.getClass();
        q qVar2 = (q) mVar;
        qVar2.Z(1671410157);
        if ((i10 & 6) == 0) {
            if (qVar2.g(z6)) {
                i20 = 4;
            } else {
                i20 = 2;
            }
            i12 = i20 | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            z11 = z10;
            if (qVar2.g(z11)) {
                i19 = 32;
            } else {
                i19 = 16;
            }
            i12 |= i19;
        } else {
            z11 = z10;
        }
        if ((i10 & 384) == 0) {
            if (qVar2.f(str)) {
                i18 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i18 = 128;
            }
            i12 |= i18;
        }
        if ((i10 & 3072) == 0) {
            aVar2 = aVar;
            if (qVar2.h(aVar2)) {
                i17 = 2048;
            } else {
                i17 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i12 |= i17;
        } else {
            aVar2 = aVar;
        }
        if ((i10 & 24576) == 0) {
            if (qVar2.h(lVar)) {
                i16 = 16384;
            } else {
                i16 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
            }
            i12 |= i16;
        }
        int i21 = i11 & 32;
        if (i21 != 0) {
            i12 |= 196608;
        } else if ((196608 & i10) == 0) {
            tVar2 = tVar;
            if (qVar2.f(tVar2)) {
                i13 = 131072;
            } else {
                i13 = 65536;
            }
            i12 |= i13;
            boolean z14 = false;
            if ((74899 & i12) == 74898) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (!qVar2.O(i12 & 1, z12)) {
                if (i21 != 0) {
                    tVar4 = i3.q.f13017a;
                } else {
                    tVar4 = tVar2;
                }
                float f10 = 16;
                t e10 = p2.e(d.F(tVar4, 20, f10), 1.0f);
                k2 a10 = i2.a(j.g(f10), i3.d.f13004y0, qVar2, 6);
                int hashCode = Long.hashCode(qVar2.T);
                o l4 = qVar2.l();
                t c5 = i3.a.c(e10, qVar2);
                h.f11920i.getClass();
                f fVar = g.f11903b;
                qVar2.b0();
                if (qVar2.S) {
                    qVar2.k(fVar);
                } else {
                    qVar2.k0();
                }
                r.J(g.f11907f, a10, qVar2);
                r.J(g.f11906e, l4, qVar2);
                r.y(qVar2, Integer.valueOf(hashCode), g.f11908g);
                r.F(g.f11909h, qVar2);
                r.J(g.f11905d, c5, qVar2);
                if (z6) {
                    i14 = R.string.author_profile_unfollow_action;
                } else {
                    i14 = R.string.author_profile_follow_action;
                }
                String R = c.R(qVar2, i14);
                if (1.0f <= 0.0d) {
                    s1.a.a("invalid weight; must be greater than zero");
                }
                t tVar5 = tVar4;
                m1 m1Var = new m1(1.0f, true);
                if (z6) {
                    echoButtonVariant = EchoButtonVariant.Secondary;
                } else {
                    echoButtonVariant = EchoButtonVariant.Primary;
                }
                EchoButtonVariant echoButtonVariant2 = echoButtonVariant;
                EchoButtonSize echoButtonSize = EchoButtonSize.Medium;
                if (z6) {
                    i15 = io.elevenlabs.ui.R.drawable.check;
                } else {
                    i15 = io.elevenlabs.ui.R.drawable.plus;
                }
                EchoButtonKt.m1835EchoButton562pCRU(R, aVar2, m1Var, echoButtonVariant2, echoButtonSize, Integer.valueOf(i15), false, false, null, z11, false, qVar2, ((i12 >> 6) & 112) | 24576 | ((i12 << 24) & 1879048192), 0, 1472);
                int i22 = io.elevenlabs.ui.R.drawable.share_android;
                String R2 = c.R(qVar2, R.string.share_read_share);
                EchoButtonVariant echoButtonVariant3 = EchoButtonVariant.Secondary;
                if ((57344 & i12) == 16384) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if ((i12 & 896) == 256) {
                    z14 = true;
                }
                boolean z15 = z13 | z14;
                Object L = qVar2.L();
                if (z15 || L == u2.l.f33918a) {
                    L = new fm.a(7, lVar, str);
                    qVar2.h0(L);
                }
                EchoIconButtonKt.EchoIconButton(i22, (a) L, null, R2, echoButtonVariant3, echoButtonSize, false, false, false, qVar2, 221184, 452);
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
                r10.f34012d = new x(z6, z10, str, aVar, lVar, tVar3, i10, i11);
                return;
            }
            return;
        }
        tVar2 = tVar;
        boolean z142 = false;
        if ((74899 & i12) == 74898) {
        }
        if (!qVar2.O(i12 & 1, z12)) {
        }
        r10 = qVar.r();
        if (r10 == null) {
        }
    }

    public static final z AuthorActionsSection$lambda$0$0$0(l lVar, String str) {
        lVar.invoke(str);
        return z.f31622a;
    }

    public static final z AuthorActionsSection$lambda$1(boolean z6, boolean z10, String str, a aVar, l lVar, t tVar, int i10, int i11, m mVar, int i12) {
        AuthorActionsSection(z6, z10, str, aVar, lVar, tVar, mVar, r.M(i10 | 1), i11);
        return z.f31622a;
    }

    public static final void AuthorActionsSection_Preview_Following(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(1681102987);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme.INSTANCE.invoke(null, ComposableSingletons$AuthorActionsSectionKt.INSTANCE.m1313getLambda$1455168795$app_productionRelease(), qVar, (EchoTheme.$stable << 6) | 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new u1(i10, 26);
        }
    }

    public static final z AuthorActionsSection_Preview_Following$lambda$0(int i10, m mVar, int i11) {
        AuthorActionsSection_Preview_Following(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void AuthorActionsSection_Preview_Loading(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(-66035658);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme.INSTANCE.invoke(null, ComposableSingletons$AuthorActionsSectionKt.INSTANCE.m1314getLambda$779912944$app_productionRelease(), qVar, (EchoTheme.$stable << 6) | 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new u1(i10, 28);
        }
    }

    public static final z AuthorActionsSection_Preview_Loading$lambda$0(int i10, m mVar, int i11) {
        AuthorActionsSection_Preview_Loading(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void AuthorActionsSection_Preview_NotFollowing(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(-985174718);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme.INSTANCE.invoke(null, ComposableSingletons$AuthorActionsSectionKt.INSTANCE.m1315getLambda$939275096$app_productionRelease(), qVar, (EchoTheme.$stable << 6) | 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new u1(i10, 27);
        }
    }

    public static final z AuthorActionsSection_Preview_NotFollowing$lambda$0(int i10, m mVar, int i11) {
        AuthorActionsSection_Preview_NotFollowing(mVar, r.M(i10 | 1));
        return z.f31622a;
    }
}
