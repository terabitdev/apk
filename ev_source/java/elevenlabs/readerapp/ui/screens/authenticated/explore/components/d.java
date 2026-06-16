package io.elevenlabs.readerapp.ui.screens.authenticated.explore.components;

import io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.echo.menu.PlayerActionsSheetKt;
import io.elevenlabs.ui.components.scaffolds.BottomSheetControl;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class d implements ho.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15421a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ho.a f15422b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BottomSheetControl f15423c;

    public /* synthetic */ d(ho.a aVar, BottomSheetControl bottomSheetControl, int i10) {
        this.f15421a = i10;
        this.f15422b = aVar;
        this.f15423c = bottomSheetControl;
    }

    @Override // ho.a
    public final Object invoke() {
        z ExploreFiltersBottomSheet$lambda$4$0$1$0$0;
        z PlayerActionsSheet$lambda$3$0$0$3$0;
        z PlayerActionsSheet$lambda$3$0$0$6$0;
        z PlayerActionsSheet$lambda$3$0$0$7$0;
        z PlayerActionsSheet$lambda$3$0$0$8$0;
        switch (this.f15421a) {
            case 0:
                ExploreFiltersBottomSheet$lambda$4$0$1$0$0 = ExploreFiltersBottomSheetKt.ExploreFiltersBottomSheet$lambda$4$0$1$0$0(this.f15422b, this.f15423c);
                return ExploreFiltersBottomSheet$lambda$4$0$1$0$0;
            case 1:
                return MultiOptionFilterBottomSheetKt.i(this.f15422b, this.f15423c);
            case 2:
                return SingleOptionFilterBottomSheetKt.c(this.f15422b, this.f15423c);
            case 3:
                PlayerActionsSheet$lambda$3$0$0$3$0 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3$0$0$3$0(this.f15423c, this.f15422b);
                return PlayerActionsSheet$lambda$3$0$0$3$0;
            case 4:
                PlayerActionsSheet$lambda$3$0$0$6$0 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3$0$0$6$0(this.f15423c, this.f15422b);
                return PlayerActionsSheet$lambda$3$0$0$6$0;
            case 5:
                PlayerActionsSheet$lambda$3$0$0$7$0 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3$0$0$7$0(this.f15423c, this.f15422b);
                return PlayerActionsSheet$lambda$3$0$0$7$0;
            default:
                PlayerActionsSheet$lambda$3$0$0$8$0 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3$0$0$8$0(this.f15423c, this.f15422b);
                return PlayerActionsSheet$lambda$3$0$0$8$0;
        }
    }

    public /* synthetic */ d(BottomSheetControl bottomSheetControl, ho.a aVar, int i10) {
        this.f15421a = i10;
        this.f15423c = bottomSheetControl;
        this.f15422b = aVar;
    }
}
