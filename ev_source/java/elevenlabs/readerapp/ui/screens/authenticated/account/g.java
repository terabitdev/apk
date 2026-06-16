package io.elevenlabs.readerapp.ui.screens.authenticated.account;

import androidx.fragment.app.j0;
import io.elevenlabs.readerapp.ui.screens.authenticated.purchases.paywall.RevenueCatPaywallState;
import io.elevenlabs.readerapp.ui.screens.authenticated.purchases.paywall.RevenueCatPaywallViewModel;
import io.elevenlabs.readerapp.ui.screens.authenticated.reads.details.ReadDetailsState;
import io.elevenlabs.readerapp.ui.screens.authenticated.reads.details.ReadDetailsViewModel;
import io.elevenlabs.ui.components.VideoPlayerKt;
import la.e0;
import p4.b0;
import p4.y;
import q2.d6;
import q2.j6;
import sn.z;
import u2.z0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class g implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15006a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f15007b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f15008c;

    public /* synthetic */ g(Object obj, boolean z6, int i10) {
        this.f15006a = i10;
        this.f15008c = obj;
        this.f15007b = z6;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        AccountState onVisibilityToggled$lambda$0;
        RevenueCatPaywallState onDismiss$lambda$0;
        ReadDetailsState onRateTitleDialogClose$lambda$0;
        z VideoPlayer__Ogyb9c$lambda$16$0;
        int i10 = this.f15006a;
        int i11 = 1;
        Object obj2 = this.f15008c;
        boolean z6 = this.f15007b;
        switch (i10) {
            case 0:
                onVisibilityToggled$lambda$0 = AccountViewModel.onVisibilityToggled$lambda$0((AccountViewModel) obj2, z6, (AccountState) obj);
                return onVisibilityToggled$lambda$0;
            case 1:
                onDismiss$lambda$0 = RevenueCatPaywallViewModel.onDismiss$lambda$0(z6, (RevenueCatPaywallViewModel) obj2, (RevenueCatPaywallState) obj);
                return onDismiss$lambda$0;
            case 2:
                onRateTitleDialogClose$lambda$0 = ReadDetailsViewModel.onRateTitleDialogClose$lambda$0(z6, (ReadDetailsViewModel) obj2, (ReadDetailsState) obj);
                return onRateTitleDialogClose$lambda$0;
            case 3:
                VideoPlayer__Ogyb9c$lambda$16$0 = VideoPlayerKt.VideoPlayer__Ogyb9c$lambda$16$0(z6, (z0) obj2, (e0) obj);
                return VideoPlayer__Ogyb9c$lambda$16$0;
            case 4:
                j.e eVar = (j.e) obj2;
                ((j0) eVar.f2625a).f(z6);
                ((k.a) eVar.f2626b).f(z6);
                return new j.c((o7.d) obj, eVar, 0);
            case 5:
                j.g gVar = (j.g) obj2;
                gVar.t(z6);
                return new j.c((o7.d) obj, gVar, 1);
            default:
                j6 j6Var = (j6) obj2;
                b0 b0Var = (b0) obj;
                z zVar = z.f31622a;
                if (!z6) {
                    oo.u[] uVarArr = y.f26563a;
                    b0Var.b(p4.w.f26544i, zVar);
                }
                y.l(String.valueOf(jo.a.y(j6Var.f27310c.h() * 100) / 100.0f), b0Var);
                b0Var.b(p4.n.f26499i, new p4.a(null, new d6(j6Var, i11)));
                return zVar;
        }
    }

    public /* synthetic */ g(boolean z6, Object obj, int i10) {
        this.f15006a = i10;
        this.f15007b = z6;
        this.f15008c = obj;
    }
}
