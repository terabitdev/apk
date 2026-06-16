package io.elevenlabs.readerapp.ui.screens.authenticated.search;

import ho.p;
import io.elevenlabs.domain.model.ReadMeta;
import io.elevenlabs.domain.model.SearchSection;
import sn.z;
import u2.m;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class a implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17026a;

    public /* synthetic */ a(int i10) {
        this.f17026a = i10;
    }

    @Override // ho.p
    public final Object invoke(Object obj, Object obj2) {
        z lambda__616975043$lambda$0;
        Object SearchScreenUI$lambda$9$1$3$0$0;
        Object SearchScreenUI$lambda$9$1$3$0$2;
        Object SearchScreenUI$lambda$9$1$3$0$4;
        switch (this.f17026a) {
            case 0:
                lambda__616975043$lambda$0 = ComposableSingletons$PreviewSearchScreenBothEmptyStatesDefaultGroupPreviewSearchScreenBothEmptyStatesKt.lambda__616975043$lambda$0((m) obj, ((Integer) obj2).intValue());
                return lambda__616975043$lambda$0;
            case 1:
                return ComposableSingletons$PreviewSearchScreenBothErrorDefaultGroupPreviewSearchScreenBothErrorKt.a((m) obj, ((Integer) obj2).intValue());
            case 2:
                return ComposableSingletons$PreviewSearchScreenBothResultsDefaultGroupPreviewSearchScreenBothResultsKt.a((m) obj, ((Integer) obj2).intValue());
            case 3:
                return ComposableSingletons$PreviewSearchScreenExploreIdleDefaultGroupPreviewSearchScreenExploreIdleKt.a((m) obj, ((Integer) obj2).intValue());
            case 4:
                return ComposableSingletons$PreviewSearchScreenLibraryIdleDefaultGroupPreviewSearchScreenLibraryIdleKt.a((m) obj, ((Integer) obj2).intValue());
            case 5:
                SearchScreenUI$lambda$9$1$3$0$0 = SearchScreenKt.SearchScreenUI$lambda$9$1$3$0$0(((Integer) obj).intValue(), (SearchSection) obj2);
                return SearchScreenUI$lambda$9$1$3$0$0;
            case 6:
                SearchScreenUI$lambda$9$1$3$0$2 = SearchScreenKt.SearchScreenUI$lambda$9$1$3$0$2(((Integer) obj).intValue(), (ReadMeta) obj2);
                return SearchScreenUI$lambda$9$1$3$0$2;
            default:
                SearchScreenUI$lambda$9$1$3$0$4 = SearchScreenKt.SearchScreenUI$lambda$9$1$3$0$4(((Integer) obj).intValue(), (SearchSection) obj2);
                return SearchScreenUI$lambda$9$1$3$0$4;
        }
    }
}
