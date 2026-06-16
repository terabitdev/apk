package io.elevenlabs.data.model.response;

import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import kotlinx.serialization.KSerializer;
import livekit.LivekitInternal$NodeStats;
import qr.f;
import vr.g;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@g(discriminator = "type")
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002\u0082\u0001\u000b\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Lio/elevenlabs/data/model/response/ReadDetailsSection;", "", "Companion", "Lio/elevenlabs/data/model/response/FlatCarouselSection;", "Lio/elevenlabs/data/model/response/MediaHeader;", "Lio/elevenlabs/data/model/response/MetaSection;", "Lio/elevenlabs/data/model/response/ReadDetailsAuthorSection;", "Lio/elevenlabs/data/model/response/ReadDetailsChaptersSection;", "Lio/elevenlabs/data/model/response/ReadDetailsDetailsSection;", "Lio/elevenlabs/data/model/response/ReadDetailsReadActions;", "Lio/elevenlabs/data/model/response/ReadDetailsTitleDescriptionSection;", "Lio/elevenlabs/data/model/response/ReadSection;", "Lio/elevenlabs/data/model/response/ReadsSection;", "Lio/elevenlabs/data/model/response/ReadsV2Section;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
@qr.g
/* loaded from: classes3.dex */
public interface ReadDetailsSection {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/data/model/response/ReadDetailsSection$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/elevenlabs/data/model/response/ReadDetailsSection;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final KSerializer serializer() {
            f0 f0Var = e0.f20562a;
            return new f("io.elevenlabs.data.model.response.ReadDetailsSection", f0Var.b(ReadDetailsSection.class), new oo.d[]{f0Var.b(FlatCarouselSection.class), f0Var.b(MediaHeader.class), f0Var.b(MetaSection.class), f0Var.b(ReadDetailsAuthorSection.class), f0Var.b(ReadDetailsChaptersSection.class), f0Var.b(ReadDetailsDetailsSection.class), f0Var.b(ReadDetailsReadActions.class), f0Var.b(ReadDetailsTitleDescriptionSection.class), f0Var.b(ReadSection.class), f0Var.b(ReadsSection.class), f0Var.b(ReadsV2Section.class)}, new KSerializer[]{FlatCarouselSection$$serializer.INSTANCE, MediaHeader$$serializer.INSTANCE, MetaSection$$serializer.INSTANCE, ReadDetailsAuthorSection$$serializer.INSTANCE, ReadDetailsChaptersSection$$serializer.INSTANCE, ReadDetailsDetailsSection$$serializer.INSTANCE, ReadDetailsReadActions$$serializer.INSTANCE, ReadDetailsTitleDescriptionSection$$serializer.INSTANCE, ReadSection$$serializer.INSTANCE, ReadsSection$$serializer.INSTANCE, ReadsV2Section$$serializer.INSTANCE}, new Annotation[]{new ReadDetailsSection$Companion$annotationImpl$kotlinx_serialization_json_JsonClassDiscriminator$0("type")});
        }
    }
}
