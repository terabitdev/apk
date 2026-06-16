package io.elevenlabs.readerapp.ui.screens.authenticated.player.contents;

import io.elevenlabs.domain.model.Chapter;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.PlayerViewModel;
import p4.b0;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class c implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16004a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Chapter f16005b;

    public /* synthetic */ c(Chapter chapter, int i10) {
        this.f16004a = i10;
        this.f16005b = chapter;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        z ChapterListItem$lambda$5$0$0;
        z PlayerContentsScreenUI$lambda$3$0$0$0$2$0$0;
        switch (this.f16004a) {
            case 0:
                ChapterListItem$lambda$5$0$0 = ChapterListItemKt.ChapterListItem$lambda$5$0$0(this.f16005b, (b0) obj);
                return ChapterListItem$lambda$5$0$0;
            default:
                PlayerContentsScreenUI$lambda$3$0$0$0$2$0$0 = PlayerContentsScreenKt.PlayerContentsScreenUI$lambda$3$0$0$0$2$0$0(this.f16005b, (PlayerViewModel) obj);
                return PlayerContentsScreenUI$lambda$3$0$0$0$2$0$0;
        }
    }
}
