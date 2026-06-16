package io.elevenlabs.readerapp.ui.previews;

import ig.f;
import io.elevenlabs.domain.model.VoiceSection;
import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import tn.o;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001\u001a\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"stubVoiceSection", "", "Lio/elevenlabs/domain/model/VoiceSection;", "stubVoiceGridSection", "Lio/elevenlabs/domain/model/VoiceSection$VoiceGridSection;", "stubVoiceCarouselSection", "Lio/elevenlabs/domain/model/VoiceSection$VoiceCarouselSection;", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class VoiceSectionsFactoryKt {
    public static final VoiceSection.VoiceCarouselSection stubVoiceCarouselSection() {
        return new VoiceSection.VoiceCarouselSection("Section title", "Section subtitle", o.b1(VoicesFactoryKt.stubVoicesList(), 6));
    }

    public static final VoiceSection.VoiceGridSection stubVoiceGridSection() {
        return new VoiceSection.VoiceGridSection("Section title", "Section subtitle", o.b1(VoicesFactoryKt.stubVoicesList(), 6));
    }

    public static final List<VoiceSection> stubVoiceSection() {
        return f.I(stubVoiceCarouselSection(), stubVoiceGridSection());
    }
}
