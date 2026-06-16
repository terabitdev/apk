package io.elevenlabs.readerapp.ui.screens.authenticated.author;

import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class AuthorProfileScreenKt$AuthorProfileContent$lambda$3$0$0$1$0$0$$inlined$itemsIndexed$default$1 implements ho.l {
    final /* synthetic */ List $items;
    final /* synthetic */ ho.p $key;

    public AuthorProfileScreenKt$AuthorProfileContent$lambda$3$0$0$1$0$0$$inlined$itemsIndexed$default$1(ho.p pVar, List list) {
        this.$key = pVar;
        this.$items = list;
    }

    public final Object invoke(int i10) {
        return this.$key.invoke(Integer.valueOf(i10), this.$items.get(i10));
    }

    @Override // ho.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).intValue());
    }
}
