package io.elevenlabs.readerapp.ui.screens.anonymous.signin;

import a2.l0;
import i3.t;
import i4.j1;
import i4.q2;
import io.elevenlabs.readerapp.R;
import io.elevenlabs.ui.extensions.AnnotatedStringExtensionsKt;
import io.elevenlabs.ui.theme.ElevenLabsTheme;
import io.elevenlabs.ui.theme.ElevenLabsThemeKt;
import io.livekit.android.rpc.RpcError;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import s4.y0;
import sn.z;
import tn.o;
import u2.q;
import u2.r;
import u2.r1;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a-\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u000f\u0010\n\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Li3/t;", "modifier", "Ls4/y0;", "style", "Lp3/x;", "color", "Lsn/z;", "SignInAccountBannedMessageText-FNF3uiM", "(Li3/t;Ls4/y0;JLu2/m;II)V", "SignInAccountBannedMessageText", "Preview_SignInAccountBannedMessageText", "(Lu2/m;I)V", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class SignInAccountBannedMessageTextKt {
    public static final void Preview_SignInAccountBannedMessageText(u2.m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(845869456);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            ElevenLabsThemeKt.ElevenLabsTheme(false, ComposableSingletons$SignInAccountBannedMessageTextKt.INSTANCE.getLambda$1663367334$app_productionRelease(), qVar, 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.components.explore.g(i10, 29);
        }
    }

    public static final z Preview_SignInAccountBannedMessageText$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_SignInAccountBannedMessageText(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    /* renamed from: SignInAccountBannedMessageText-FNF3uiM */
    public static final void m1184SignInAccountBannedMessageTextFNF3uiM(t tVar, y0 y0Var, long j4, u2.m mVar, int i10, int i11) {
        t tVar2;
        int i12;
        int i13;
        y0 y0Var2;
        long j10;
        boolean z6;
        y0 y0Var3;
        long j11;
        t tVar3;
        y0 y0Var4;
        y0 y0Var5;
        long j12;
        t tVar4;
        int i14;
        int i15;
        q qVar = (q) mVar;
        qVar.Z(493845485);
        int i16 = i11 & 1;
        if (i16 != 0) {
            i12 = i10 | 6;
            tVar2 = tVar;
        } else if ((i10 & 6) == 0) {
            tVar2 = tVar;
            if (qVar.f(tVar2)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i12 = i13 | i10;
        } else {
            tVar2 = tVar;
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if ((i11 & 2) == 0) {
                y0Var2 = y0Var;
                if (qVar.f(y0Var2)) {
                    i15 = 32;
                    i12 |= i15;
                }
            } else {
                y0Var2 = y0Var;
            }
            i15 = 16;
            i12 |= i15;
        } else {
            y0Var2 = y0Var;
        }
        if ((i10 & 384) == 0) {
            j10 = j4;
            if ((i11 & 4) == 0 && qVar.e(j10)) {
                i14 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i14 = 128;
            }
            i12 |= i14;
        } else {
            j10 = j4;
        }
        if ((i12 & 147) != 146) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i12 & 1, z6)) {
            qVar.T();
            if ((i10 & 1) != 0 && !qVar.y()) {
                qVar.R();
                if ((i11 & 2) != 0) {
                    i12 &= -113;
                }
                if ((i11 & 4) != 0) {
                    i12 &= -897;
                }
                y0Var5 = y0Var2;
                j12 = j10;
                tVar4 = tVar2;
            } else {
                if (i16 != 0) {
                    tVar3 = i3.q.f13017a;
                } else {
                    tVar3 = tVar2;
                }
                if ((i11 & 2) != 0) {
                    y0Var4 = ElevenLabsTheme.INSTANCE.getTypo(qVar, ElevenLabsTheme.$stable).getSubtitleMedium500();
                    i12 &= -113;
                } else {
                    y0Var4 = y0Var2;
                }
                if ((i11 & 4) != 0) {
                    i12 &= -897;
                    tVar4 = tVar3;
                    y0Var5 = y0Var4;
                    j12 = ElevenLabsTheme.INSTANCE.getColor(qVar, ElevenLabsTheme.$stable).getButtonText().m2040getDangerLight0d7_KjU();
                } else {
                    y0Var5 = y0Var4;
                    j12 = j10;
                    tVar4 = tVar3;
                }
            }
            qVar.q();
            Object obj = (q2) qVar.j(j1.f13138r);
            s4.h parseMarkdownLinks = AnnotatedStringExtensionsKt.parseMarkdownLinks(kj.c.R(qVar, R.string.signin_error_account_banned), qVar, 0);
            y0 a10 = y0.a(y0Var5, j12, 0L, null, null, null, 0L, 0, 0L, null, null, 16777214);
            y0 y0Var6 = y0Var5;
            j11 = j12;
            boolean f10 = qVar.f(parseMarkdownLinks) | qVar.h(obj);
            Object L = qVar.L();
            if (f10 || L == u2.l.f33918a) {
                L = new h(parseMarkdownLinks, obj, 3);
                qVar.h0(L);
            }
            l0.c(parseMarkdownLinks, tVar4, a10, false, 0, 0, null, (ho.l) L, qVar, (i12 << 3) & 112, 120);
            y0Var3 = y0Var6;
            tVar2 = tVar4;
        } else {
            qVar.R();
            y0Var3 = y0Var2;
            j11 = j10;
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.components.explore.n(tVar2, y0Var3, j11, i10, i11);
        }
    }

    public static final z SignInAccountBannedMessageText_FNF3uiM$lambda$0$0(s4.h hVar, q2 q2Var, int i10) {
        s4.f fVar = (s4.f) o.y0(hVar.b(i10, i10, "href"));
        if (fVar != null) {
            q2Var.openUri((String) fVar.f31030a);
        }
        return z.f31622a;
    }

    public static final z SignInAccountBannedMessageText_FNF3uiM$lambda$1(t tVar, y0 y0Var, long j4, int i10, int i11, u2.m mVar, int i12) {
        m1184SignInAccountBannedMessageTextFNF3uiM(tVar, y0Var, j4, mVar, r.M(i10 | 1), i11);
        return z.f31622a;
    }
}
