package io.elevenlabs.readerapp.ui.previews;

import io.elevenlabs.domain.model.PublisherProfile;
import java.util.Date;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0006\u0010\u0000\u001a\u00020\u0001¨\u0006\u0002"}, d2 = {"stubPublisherProfile", "Lio/elevenlabs/domain/model/PublisherProfile;", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class ProfileFactoryKt {
    public static final PublisherProfile stubPublisherProfile() {
        return new PublisherProfile("abc", "John Doe", new Date(123L), new Date(123L), "Pioneer of science fiction and visionary author whose works like \"The Time Machine\" and \"The War of the Worlds\" shaped the genre and continue to captivate readers today. His stories blend scientific romance with social commentary, exploring themes that remain relevant in modern times.", "https://thispersondoesnotexist.com/", null, null, null, null, "Paolo Eleveno", 960, null);
    }
}
