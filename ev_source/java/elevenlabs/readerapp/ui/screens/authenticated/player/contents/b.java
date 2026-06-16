package io.elevenlabs.readerapp.ui.screens.authenticated.player.contents;

import ho.p;
import io.elevenlabs.domain.model.Chapter;
import sn.z;
import u2.m;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class b implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16002a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Chapter f16003b;

    public /* synthetic */ b(Chapter chapter, int i10) {
        this.f16002a = i10;
        this.f16003b = chapter;
    }

    @Override // ho.p
    public final Object invoke(Object obj, Object obj2) {
        z Preview_ChapterListItem$lambda$0;
        z Preview_PlayerContentsScreenUI$lambda$0;
        int i10 = this.f16002a;
        m mVar = (m) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i10) {
            case 0:
                Preview_ChapterListItem$lambda$0 = ChapterListItemKt.Preview_ChapterListItem$lambda$0(this.f16003b, mVar, intValue);
                return Preview_ChapterListItem$lambda$0;
            default:
                Preview_PlayerContentsScreenUI$lambda$0 = PlayerContentsScreenKt.Preview_PlayerContentsScreenUI$lambda$0(this.f16003b, mVar, intValue);
                return Preview_PlayerContentsScreenUI$lambda$0;
        }
    }
}
