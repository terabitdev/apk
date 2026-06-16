package io.elevenlabs.readerapp.ui.screens.authenticated.home.v4;

import io.elevenlabs.domain.model.User;
import io.elevenlabs.domain.model.home.HomePageV4;
import io.elevenlabs.readerapp.ui.previews.HomeFactoryKt;
import io.elevenlabs.readerapp.ui.previews.ReadsFactoryKt;
import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/home/v4/HomeScreenV4PreviewProvider;", "Lg5/a;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/home/v4/HomeStateV4;", "<init>", "()V", "Lvq/h;", "values", "Lvq/h;", "getValues", "()Lvq/h;", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class HomeScreenV4PreviewProvider implements g5.a {
    public static final int $stable = 8;
    private final vq.h values;

    public HomeScreenV4PreviewProvider() {
        HomeStateV4 homeStateV4 = new HomeStateV4(false, false, null, HomeFactoryKt.stubHomePageV4(), null, null, 30L, false, Boolean.TRUE, HomeFactoryKt.stubUser(), null, null, false, false, null, null, 64693, null);
        User stubUser = HomeFactoryKt.stubUser();
        List stubReadMetaList$default = ReadsFactoryKt.stubReadMetaList$default(4, null, 2, null);
        HomePageV4 stubHomePageV4 = HomeFactoryKt.stubHomePageV4();
        Boolean bool = Boolean.FALSE;
        HomeStateV4 homeStateV42 = new HomeStateV4(false, false, null, stubHomePageV4, stubReadMetaList$default, null, 30L, false, bool, stubUser, null, null, false, false, null, null, 64677, null);
        User stubUser2 = HomeFactoryKt.stubUser();
        this.values = tn.n.n0(new HomeStateV4[]{homeStateV4, homeStateV42, new HomeStateV4(false, false, null, new HomePageV4(tn.o.O0(HomeFactoryKt.stubHomePageV4().getSections(), ig.f.H(HomeFactoryKt.stubWarningSection()))), ReadsFactoryKt.stubReadMetaList$default(4, null, 2, null), null, 30L, false, bool, stubUser2, null, null, false, false, null, null, 64677, null)});
    }

    @Override // g5.a
    public /* bridge */ int getCount() {
        return super.getCount();
    }

    public /* bridge */ String getDisplayName(int i10) {
        return null;
    }

    @Override // g5.a
    public vq.h getValues() {
        return this.values;
    }
}
