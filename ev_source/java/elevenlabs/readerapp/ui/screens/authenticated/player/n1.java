package io.elevenlabs.readerapp.ui.screens.authenticated.player;

import io.elevenlabs.domain.Analytics;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class n1 implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16242a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PlayerViewModel f16243b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Analytics.Event.PlayerActionSource f16244c;

    public /* synthetic */ n1(PlayerViewModel playerViewModel, Analytics.Event.PlayerActionSource playerActionSource, int i10) {
        this.f16242a = i10;
        this.f16243b = playerViewModel;
        this.f16244c = playerActionSource;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        PlayerState onBookmarksClick$lambda$0;
        PlayerState onCustomizeClick$lambda$0;
        PlayerState onRenameClick$lambda$0;
        PlayerState onRateTitleClick$lambda$0;
        PlayerState delete$lambda$0;
        PlayerState onShareClick$lambda$0;
        PlayerState onContentsClick$lambda$0;
        switch (this.f16242a) {
            case 0:
                onBookmarksClick$lambda$0 = PlayerViewModel.onBookmarksClick$lambda$0(this.f16243b, this.f16244c, (PlayerState) obj);
                return onBookmarksClick$lambda$0;
            case 1:
                onCustomizeClick$lambda$0 = PlayerViewModel.onCustomizeClick$lambda$0(this.f16243b, this.f16244c, (PlayerState) obj);
                return onCustomizeClick$lambda$0;
            case 2:
                onRenameClick$lambda$0 = PlayerViewModel.onRenameClick$lambda$0(this.f16243b, this.f16244c, (PlayerState) obj);
                return onRenameClick$lambda$0;
            case 3:
                onRateTitleClick$lambda$0 = PlayerViewModel.onRateTitleClick$lambda$0(this.f16243b, this.f16244c, (PlayerState) obj);
                return onRateTitleClick$lambda$0;
            case 4:
                delete$lambda$0 = PlayerViewModel.delete$lambda$0(this.f16243b, this.f16244c, (PlayerState) obj);
                return delete$lambda$0;
            case 5:
                onShareClick$lambda$0 = PlayerViewModel.onShareClick$lambda$0(this.f16243b, this.f16244c, (PlayerState) obj);
                return onShareClick$lambda$0;
            default:
                onContentsClick$lambda$0 = PlayerViewModel.onContentsClick$lambda$0(this.f16243b, this.f16244c, (PlayerState) obj);
                return onContentsClick$lambda$0;
        }
    }
}
