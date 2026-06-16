package io.elevenlabs.readerapp.ui.screens.authenticated.player.contents;

import io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.RenameDialogKt;
import sn.z;
import u2.z0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class d implements ho.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16006a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ho.l f16007b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z0 f16008c;

    public /* synthetic */ d(ho.l lVar, z0 z0Var, int i10) {
        this.f16006a = i10;
        this.f16007b = lVar;
        this.f16008c = z0Var;
    }

    @Override // ho.a
    public final Object invoke() {
        z ChapterListItem$lambda$5$3$0$0;
        z ChapterListItem$lambda$5$3$1$0;
        switch (this.f16006a) {
            case 0:
                ChapterListItem$lambda$5$3$0$0 = ChapterListItemKt.ChapterListItem$lambda$5$3$0$0(this.f16007b, this.f16008c);
                return ChapterListItem$lambda$5$3$0$0;
            case 1:
                ChapterListItem$lambda$5$3$1$0 = ChapterListItemKt.ChapterListItem$lambda$5$3$1$0(this.f16007b, this.f16008c);
                return ChapterListItem$lambda$5$3$1$0;
            default:
                return RenameDialogKt.b(this.f16007b, this.f16008c);
        }
    }
}
