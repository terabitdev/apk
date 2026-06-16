package io.elevenlabs.readerapp.ui.screens.authenticated.player.elements;

import io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.ContentSearchViewModel;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.ContentSearchViewModel$bindReadId$2;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.ReadBookmarksViewModel$initialize$2;
import java.util.List;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class l implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16116a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f16117b;

    public /* synthetic */ l(List list, int i10) {
        this.f16116a = i10;
        this.f16117b = list;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        ContentSearchState invokeSuspend$lambda$0;
        switch (this.f16116a) {
            case 0:
                invokeSuspend$lambda$0 = ContentSearchViewModel.AnonymousClass1.AnonymousClass3.invokeSuspend$lambda$0(this.f16117b, (ContentSearchState) obj);
                return invokeSuspend$lambda$0;
            case 1:
                return ContentSearchViewModel$bindReadId$2.AnonymousClass1.a(this.f16117b, (ContentSearchState) obj);
            default:
                return ReadBookmarksViewModel$initialize$2.AnonymousClass1.a(this.f16117b, (ReadBookmarksState) obj);
        }
    }
}
