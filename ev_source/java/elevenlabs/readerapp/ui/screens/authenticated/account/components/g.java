package io.elevenlabs.readerapp.ui.screens.authenticated.account.components;

import io.elevenlabs.readerapp.ui.screens.authenticated.explore.components.ExploreFiltersBottomSheetKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.contents.PlayerContentsScreenKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.echo.menu.PlayerActionsSheetKt;
import io.elevenlabs.ui.components.scaffolds.BottomSheetControl;
import io.elevenlabs.ui.components.scaffolds.BottomSheetScaffoldKt;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class g implements ho.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14964a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BottomSheetControl f14965b;

    public /* synthetic */ g(BottomSheetControl bottomSheetControl, int i10) {
        this.f14964a = i10;
        this.f14965b = bottomSheetControl;
    }

    @Override // ho.a
    public final Object invoke() {
        z PlayerContentsScreen$lambda$1$0$0$0;
        switch (this.f14964a) {
            case 0:
                return ComposableSingletons$CustomerCenterSheetKt.a(this.f14965b);
            case 1:
                return ExploreFiltersBottomSheetKt.e(this.f14965b);
            case 2:
                PlayerContentsScreen$lambda$1$0$0$0 = PlayerContentsScreenKt.PlayerContentsScreen$lambda$1$0$0$0(this.f14965b);
                return PlayerContentsScreen$lambda$1$0$0$0;
            case 3:
                return BottomSheetScaffoldKt.b(this.f14965b);
            case 4:
                return BottomSheetScaffoldKt.m(this.f14965b);
            case 5:
                return PlayerActionsSheetKt.x(this.f14965b);
            case 6:
                return PlayerActionsSheetKt.q(this.f14965b);
            default:
                return PlayerActionsSheetKt.f(this.f14965b);
        }
    }
}
