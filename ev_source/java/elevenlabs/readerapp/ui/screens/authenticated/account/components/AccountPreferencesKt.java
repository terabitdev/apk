package io.elevenlabs.readerapp.ui.screens.authenticated.account.components;

import c3.o;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import i3.t;
import io.elevenlabs.readerapp.R;
import io.elevenlabs.readerapp.ui.screens.authenticated.c1;
import io.elevenlabs.ui.components.ActionRowItemKt;
import io.elevenlabs.ui.echo.EchoTheme;
import io.livekit.android.rpc.RpcError;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import r1.p2;
import r1.w;
import r1.x;
import sn.z;
import u2.m;
import u2.q;
import u2.r;
import u2.r1;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u001aG\u0010\u0006\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u000f\u0010\b\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lkotlin/Function0;", "Lsn/z;", "onNavigateToReferAFriend", "onNavigateToExplorePreferences", "onNavigateToCustomerCenter", "onNavigateToHoursHistory", "AccountPreferences", "(Lho/a;Lho/a;Lho/a;Lho/a;Lu2/m;I)V", "Preview_AccountPreferences", "(Lu2/m;I)V", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class AccountPreferencesKt {
    public static final void AccountPreferences(ho.a aVar, ho.a aVar2, ho.a aVar3, ho.a aVar4, m mVar, int i10) {
        int i11;
        boolean z6;
        int i12;
        int i13;
        int i14;
        int i15;
        aVar.getClass();
        aVar2.getClass();
        aVar3.getClass();
        aVar4.getClass();
        q qVar = (q) mVar;
        qVar.Z(25353682);
        if ((i10 & 6) == 0) {
            if (qVar.h(aVar)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i11 = i15 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar.h(aVar2)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i11 |= i14;
        }
        if ((i10 & 384) == 0) {
            if (qVar.h(aVar3)) {
                i13 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i13 = 128;
            }
            i11 |= i13;
        }
        if ((i10 & 3072) == 0) {
            if (qVar.h(aVar4)) {
                i12 = 2048;
            } else {
                i12 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i11 |= i12;
        }
        if ((i11 & 1171) != 1170) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i11 & 1, z6)) {
            x a10 = w.a(r1.j.f29230c, i3.d.B0, qVar, 0);
            int hashCode = Long.hashCode(qVar.T);
            o l4 = qVar.l();
            i3.q qVar2 = i3.q.f13017a;
            t c5 = i3.a.c(qVar2, qVar);
            h4.h.f11920i.getClass();
            h4.f fVar = h4.g.f11903b;
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            r.J(h4.g.f11907f, a10, qVar);
            r.J(h4.g.f11906e, l4, qVar);
            r.y(qVar, Integer.valueOf(hashCode), h4.g.f11908g);
            r.F(h4.g.f11909h, qVar);
            r.J(h4.g.f11905d, c5, qVar);
            ActionRowItemKt.ActionRowItem(kj.c.R(qVar, R.string.account_refer_friend), null, Integer.valueOf(io.elevenlabs.ui.R.drawable.gift), null, aVar, qVar, (i11 << 12) & 57344, 10);
            EchoTheme echoTheme = EchoTheme.INSTANCE;
            int i16 = EchoTheme.$stable;
            ib.i.o(echoTheme, qVar, i16, qVar2, qVar);
            ActionRowItemKt.ActionRowItem(kj.c.R(qVar, R.string.account_and_support), null, Integer.valueOf(io.elevenlabs.ui.R.drawable.settings_gear), null, aVar3, qVar, (i11 << 6) & 57344, 10);
            ib.i.o(echoTheme, qVar, i16, qVar2, qVar);
            ActionRowItemKt.ActionRowItem(kj.c.R(qVar, R.string.account_content_preferences), null, Integer.valueOf(io.elevenlabs.ui.R.drawable.preferences), Integer.valueOf(io.elevenlabs.ui.R.drawable.chevron_right_rounded), aVar2, qVar, (i11 << 9) & 57344, 2);
            ib.i.o(echoTheme, qVar, i16, qVar2, qVar);
            ActionRowItemKt.ActionRowItem(kj.c.R(qVar, R.string.account_settings_listening_hours_history), null, Integer.valueOf(io.elevenlabs.ui.R.drawable.calendar_clock__date_time), null, aVar4, qVar, (i11 << 3) & 57344, 10);
            r1.d.g(p2.f(qVar2, echoTheme.getSpacings(qVar, i16).getX5()), qVar);
            qVar.p(true);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new c3.d(aVar, aVar2, aVar3, aVar4, i10, 1);
        }
    }

    public static final z AccountPreferences$lambda$1(ho.a aVar, ho.a aVar2, ho.a aVar3, ho.a aVar4, int i10, m mVar, int i11) {
        AccountPreferences(aVar, aVar2, aVar3, aVar4, mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_AccountPreferences(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(1364616669);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme.INSTANCE.invoke(null, ComposableSingletons$AccountPreferencesKt.INSTANCE.getLambda$664424771$app_productionRelease(), qVar, (EchoTheme.$stable << 6) | 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new c1(i10, 19);
        }
    }

    public static final z Preview_AccountPreferences$lambda$0(int i10, m mVar, int i11) {
        Preview_AccountPreferences(mVar, r.M(i10 | 1));
        return z.f31622a;
    }
}
