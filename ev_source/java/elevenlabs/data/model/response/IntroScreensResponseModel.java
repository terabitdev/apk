package io.elevenlabs.data.model.response;

import android.gov.nist.core.Separators;
import io.elevenlabs.data.model.BookPreviewIntroModel;
import io.elevenlabs.data.model.BookPreviewIntroModel$$serializer;
import io.elevenlabs.data.model.PodcastPreviewIntroModel;
import io.elevenlabs.data.model.PodcastPreviewIntroModel$$serializer;
import io.elevenlabs.data.model.StreaksIntroModel;
import io.elevenlabs.data.model.StreaksIntroModel$$serializer;
import io.elevenlabs.data.model.VoicePreviewIntroModel;
import io.elevenlabs.data.model.VoicePreviewIntroModel$$serializer;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import livekit.LivekitInternal$NodeStats;
import qr.g;
import ur.c1;
import ur.t0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u0000 :2\u00020\u0001:\u0002;:B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bBC\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\bHÆ\u0003¢\u0006\u0004\b \u0010!J8\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010%\u001a\u00020$HÖ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b+\u0010,R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010-\u0012\u0004\b/\u00100\u001a\u0004\b.\u0010\u001bR \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u00101\u0012\u0004\b3\u00100\u001a\u0004\b2\u0010\u001dR \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u00104\u0012\u0004\b6\u00100\u001a\u0004\b5\u0010\u001fR \u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u00107\u0012\u0004\b9\u00100\u001a\u0004\b8\u0010!¨\u0006<"}, d2 = {"Lio/elevenlabs/data/model/response/IntroScreensResponseModel;", "", "Lio/elevenlabs/data/model/BookPreviewIntroModel;", "bookPreview", "Lio/elevenlabs/data/model/VoicePreviewIntroModel;", "voicePreview", "Lio/elevenlabs/data/model/PodcastPreviewIntroModel;", "podcastPreview", "Lio/elevenlabs/data/model/StreaksIntroModel;", "streaks", "<init>", "(Lio/elevenlabs/data/model/BookPreviewIntroModel;Lio/elevenlabs/data/model/VoicePreviewIntroModel;Lio/elevenlabs/data/model/PodcastPreviewIntroModel;Lio/elevenlabs/data/model/StreaksIntroModel;)V", "", "seen0", "Lur/c1;", "serializationConstructorMarker", "(ILio/elevenlabs/data/model/BookPreviewIntroModel;Lio/elevenlabs/data/model/VoicePreviewIntroModel;Lio/elevenlabs/data/model/PodcastPreviewIntroModel;Lio/elevenlabs/data/model/StreaksIntroModel;Lur/c1;)V", "self", "Ltr/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lsn/z;", "write$Self$data_release", "(Lio/elevenlabs/data/model/response/IntroScreensResponseModel;Ltr/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lio/elevenlabs/data/model/BookPreviewIntroModel;", "component2", "()Lio/elevenlabs/data/model/VoicePreviewIntroModel;", "component3", "()Lio/elevenlabs/data/model/PodcastPreviewIntroModel;", "component4", "()Lio/elevenlabs/data/model/StreaksIntroModel;", "copy", "(Lio/elevenlabs/data/model/BookPreviewIntroModel;Lio/elevenlabs/data/model/VoicePreviewIntroModel;Lio/elevenlabs/data/model/PodcastPreviewIntroModel;Lio/elevenlabs/data/model/StreaksIntroModel;)Lio/elevenlabs/data/model/response/IntroScreensResponseModel;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lio/elevenlabs/data/model/BookPreviewIntroModel;", "getBookPreview", "getBookPreview$annotations", "()V", "Lio/elevenlabs/data/model/VoicePreviewIntroModel;", "getVoicePreview", "getVoicePreview$annotations", "Lio/elevenlabs/data/model/PodcastPreviewIntroModel;", "getPodcastPreview", "getPodcastPreview$annotations", "Lio/elevenlabs/data/model/StreaksIntroModel;", "getStreaks", "getStreaks$annotations", "Companion", "$serializer", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
@g
/* loaded from: classes3.dex */
public final /* data */ class IntroScreensResponseModel {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final BookPreviewIntroModel bookPreview;
    private final PodcastPreviewIntroModel podcastPreview;
    private final StreaksIntroModel streaks;
    private final VoicePreviewIntroModel voicePreview;

    public /* synthetic */ IntroScreensResponseModel(int i10, BookPreviewIntroModel bookPreviewIntroModel, VoicePreviewIntroModel voicePreviewIntroModel, PodcastPreviewIntroModel podcastPreviewIntroModel, StreaksIntroModel streaksIntroModel, c1 c1Var) {
        if (15 == (i10 & 15)) {
            this.bookPreview = bookPreviewIntroModel;
            this.voicePreview = voicePreviewIntroModel;
            this.podcastPreview = podcastPreviewIntroModel;
            this.streaks = streaksIntroModel;
            return;
        }
        t0.j(i10, 15, IntroScreensResponseModel$$serializer.INSTANCE.getDescriptor());
        throw null;
    }

    public static /* synthetic */ IntroScreensResponseModel copy$default(IntroScreensResponseModel introScreensResponseModel, BookPreviewIntroModel bookPreviewIntroModel, VoicePreviewIntroModel voicePreviewIntroModel, PodcastPreviewIntroModel podcastPreviewIntroModel, StreaksIntroModel streaksIntroModel, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            bookPreviewIntroModel = introScreensResponseModel.bookPreview;
        }
        if ((i10 & 2) != 0) {
            voicePreviewIntroModel = introScreensResponseModel.voicePreview;
        }
        if ((i10 & 4) != 0) {
            podcastPreviewIntroModel = introScreensResponseModel.podcastPreview;
        }
        if ((i10 & 8) != 0) {
            streaksIntroModel = introScreensResponseModel.streaks;
        }
        return introScreensResponseModel.copy(bookPreviewIntroModel, voicePreviewIntroModel, podcastPreviewIntroModel, streaksIntroModel);
    }

    public static final /* synthetic */ void write$Self$data_release(IntroScreensResponseModel self, tr.b output, SerialDescriptor serialDesc) {
        output.g(serialDesc, 0, BookPreviewIntroModel$$serializer.INSTANCE, self.bookPreview);
        output.g(serialDesc, 1, VoicePreviewIntroModel$$serializer.INSTANCE, self.voicePreview);
        output.g(serialDesc, 2, PodcastPreviewIntroModel$$serializer.INSTANCE, self.podcastPreview);
        output.g(serialDesc, 3, StreaksIntroModel$$serializer.INSTANCE, self.streaks);
    }

    /* renamed from: component1, reason: from getter */
    public final BookPreviewIntroModel getBookPreview() {
        return this.bookPreview;
    }

    /* renamed from: component2, reason: from getter */
    public final VoicePreviewIntroModel getVoicePreview() {
        return this.voicePreview;
    }

    /* renamed from: component3, reason: from getter */
    public final PodcastPreviewIntroModel getPodcastPreview() {
        return this.podcastPreview;
    }

    /* renamed from: component4, reason: from getter */
    public final StreaksIntroModel getStreaks() {
        return this.streaks;
    }

    public final IntroScreensResponseModel copy(BookPreviewIntroModel bookPreview, VoicePreviewIntroModel voicePreview, PodcastPreviewIntroModel podcastPreview, StreaksIntroModel streaks) {
        bookPreview.getClass();
        voicePreview.getClass();
        podcastPreview.getClass();
        streaks.getClass();
        return new IntroScreensResponseModel(bookPreview, voicePreview, podcastPreview, streaks);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IntroScreensResponseModel)) {
            return false;
        }
        IntroScreensResponseModel introScreensResponseModel = (IntroScreensResponseModel) other;
        if (m.c(this.bookPreview, introScreensResponseModel.bookPreview) && m.c(this.voicePreview, introScreensResponseModel.voicePreview) && m.c(this.podcastPreview, introScreensResponseModel.podcastPreview) && m.c(this.streaks, introScreensResponseModel.streaks)) {
            return true;
        }
        return false;
    }

    public final BookPreviewIntroModel getBookPreview() {
        return this.bookPreview;
    }

    public final PodcastPreviewIntroModel getPodcastPreview() {
        return this.podcastPreview;
    }

    public final StreaksIntroModel getStreaks() {
        return this.streaks;
    }

    public final VoicePreviewIntroModel getVoicePreview() {
        return this.voicePreview;
    }

    public int hashCode() {
        return this.streaks.hashCode() + ((this.podcastPreview.hashCode() + ((this.voicePreview.hashCode() + (this.bookPreview.hashCode() * 31)) * 31)) * 31);
    }

    public String toString() {
        return "IntroScreensResponseModel(bookPreview=" + this.bookPreview + ", voicePreview=" + this.voicePreview + ", podcastPreview=" + this.podcastPreview + ", streaks=" + this.streaks + Separators.RPAREN;
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/data/model/response/IntroScreensResponseModel$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/elevenlabs/data/model/response/IntroScreensResponseModel;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public final KSerializer serializer() {
            return IntroScreensResponseModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public static /* synthetic */ void getBookPreview$annotations() {
    }

    public static /* synthetic */ void getPodcastPreview$annotations() {
    }

    public static /* synthetic */ void getStreaks$annotations() {
    }

    public static /* synthetic */ void getVoicePreview$annotations() {
    }

    public IntroScreensResponseModel(BookPreviewIntroModel bookPreviewIntroModel, VoicePreviewIntroModel voicePreviewIntroModel, PodcastPreviewIntroModel podcastPreviewIntroModel, StreaksIntroModel streaksIntroModel) {
        bookPreviewIntroModel.getClass();
        voicePreviewIntroModel.getClass();
        podcastPreviewIntroModel.getClass();
        streaksIntroModel.getClass();
        this.bookPreview = bookPreviewIntroModel;
        this.voicePreview = voicePreviewIntroModel;
        this.podcastPreview = podcastPreviewIntroModel;
        this.streaks = streaksIntroModel;
    }
}
