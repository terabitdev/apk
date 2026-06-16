package io.elevenlabs.readerapp.ui.screens.authenticated.assistant.components;

import c3.o;
import e5.k;
import h4.f;
import h4.g;
import h4.h;
import ho.l;
import i3.d;
import i3.t;
import ib.i;
import io.elevenlabs.readerapp.R;
import io.elevenlabs.readerapp.ui.screens.authenticated.account.explore.e;
import io.elevenlabs.ui.components.AutoScrollingChipRowKt;
import io.elevenlabs.ui.echo.EchoTheme;
import io.elevenlabs.ui.echo.EchoThemeColors;
import io.elevenlabs.ui.echo.EchoThemeTypography;
import io.livekit.android.rpc.RpcError;
import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import q2.j7;
import r1.j;
import r1.p2;
import r1.w;
import r1.x;
import sn.z;
import t2.u;
import u2.m;
import u2.q;
import u2.r;
import u2.r1;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a;\u0010\b\u001a\u00020\u00042\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\b\u0010\t\u001a\u000f\u0010\n\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"", "", "prompts", "Lkotlin/Function1;", "Lsn/z;", "onPromptClick", "Li3/t;", "modifier", "PromptSuggestionsSection", "(Ljava/util/List;Lho/l;Li3/t;Lu2/m;II)V", "Preview_PromptSuggestionsSection", "(Lu2/m;I)V", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class PromptSuggestionsSectionKt {
    public static final void Preview_PromptSuggestionsSection(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(1733135664);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme.INSTANCE.invoke(null, ComposableSingletons$PromptSuggestionsSectionKt.INSTANCE.m1293getLambda$1002009066$app_productionRelease(), qVar, (EchoTheme.$stable << 6) | 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new e(i10, 26);
        }
    }

    public static final z Preview_PromptSuggestionsSection$lambda$0(int i10, m mVar, int i11) {
        Preview_PromptSuggestionsSection(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PromptSuggestionsSection(List<String> list, l lVar, t tVar, m mVar, int i10, int i11) {
        int i12;
        t tVar2;
        int i13;
        boolean z6;
        List<String> list2;
        t tVar3;
        r1 r10;
        io.elevenlabs.readerapp.ui.components.z zVar;
        t tVar4;
        int i14;
        int i15;
        list.getClass();
        lVar.getClass();
        q qVar = (q) mVar;
        qVar.Z(-707255105);
        if ((i10 & 6) == 0) {
            if (qVar.h(list)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i12 = i15 | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar.h(lVar)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
        }
        int i16 = i11 & 4;
        if (i16 != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            tVar2 = tVar;
            if (qVar.f(tVar2)) {
                i13 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i13 = 128;
            }
            i12 |= i13;
            if ((i12 & 147) == 146) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (!qVar.O(i12 & 1, z6)) {
                i3.q qVar2 = i3.q.f13017a;
                if (i16 != 0) {
                    tVar4 = qVar2;
                } else {
                    tVar4 = tVar2;
                }
                if (list.isEmpty()) {
                    r10 = qVar.r();
                    if (r10 != null) {
                        zVar = new io.elevenlabs.readerapp.ui.components.z(list, lVar, tVar4, i10, i11, 1);
                        r10.f34012d = zVar;
                        return;
                    }
                    return;
                }
                t tVar5 = tVar4;
                int size = (list.size() + 1) / 2;
                t e10 = p2.e(tVar5, 1.0f);
                x a10 = w.a(j.f29230c, d.B0, qVar, 0);
                int hashCode = Long.hashCode(qVar.T);
                o l4 = qVar.l();
                t c5 = i3.a.c(e10, qVar);
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
                t e11 = p2.e(qVar2, 1.0f);
                EchoTheme echoTheme = EchoTheme.INSTANCE;
                int i17 = EchoTheme.$stable;
                j7.d(kj.c.R(qVar, R.string.assistant_suggested_prompt_titles), r1.d.G(e11, echoTheme.getSpacings(qVar, i17).getX6(), u.P, 2), p3.x.b(0.57f, echoTheme.getColors(qVar, i17).getText().getPrimary(qVar, EchoThemeColors.Text.$stable)), 0L, null, 0L, new k(3), 0L, 0, false, 0, 0, null, echoTheme.getTypography(qVar, i17).getBaseRegular400(qVar, EchoThemeTypography.$stable), qVar, 0, 0, 130040);
                qVar = qVar;
                r1.d.g(p2.f(qVar2, echoTheme.getSpacings(qVar, i17).getX6()), qVar);
                list2 = list;
                int i18 = (i12 & 112) | 3456;
                AutoScrollingChipRowKt.m1776AutoScrollingChipRow6PoWaU8(tn.o.b1(list2, size), lVar, p2.e(qVar2, 1.0f), 20, u.P, qVar, i18, 16);
                i.o(echoTheme, qVar, i17, qVar2, qVar);
                AutoScrollingChipRowKt.m1776AutoScrollingChipRow6PoWaU8(tn.o.q0(list2, size), lVar, p2.e(qVar2, 1.0f), 30, u.P, qVar, i18, 16);
                qVar.p(true);
                tVar3 = tVar5;
            } else {
                list2 = list;
                qVar.R();
                tVar3 = tVar2;
            }
            r10 = qVar.r();
            if (r10 == null) {
                zVar = new io.elevenlabs.readerapp.ui.components.z(list2, lVar, tVar3, i10, i11, 2);
                r10.f34012d = zVar;
                return;
            }
            return;
        }
        tVar2 = tVar;
        if ((i12 & 147) == 146) {
        }
        if (!qVar.O(i12 & 1, z6)) {
        }
        r10 = qVar.r();
        if (r10 == null) {
        }
    }

    public static final z PromptSuggestionsSection$lambda$0(List list, l lVar, t tVar, int i10, int i11, m mVar, int i12) {
        PromptSuggestionsSection(list, lVar, tVar, mVar, r.M(i10 | 1), i11);
        return z.f31622a;
    }

    public static final z PromptSuggestionsSection$lambda$2(List list, l lVar, t tVar, int i10, int i11, m mVar, int i12) {
        PromptSuggestionsSection(list, lVar, tVar, mVar, r.M(i10 | 1), i11);
        return z.f31622a;
    }
}
