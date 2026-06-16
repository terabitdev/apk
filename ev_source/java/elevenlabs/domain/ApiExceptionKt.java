package io.elevenlabs.domain;

import java.util.Set;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import tn.n;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0003\"\u0017\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"PERMANENT_API_ERRORS", "", "", "getPERMANENT_API_ERRORS", "()Ljava/util/Set;", "domain"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class ApiExceptionKt {
    private static final Set<String> PERMANENT_API_ERRORS = n.f1(new String[]{"anonymous_position_limit", "insufficient_credits", "insufficient_premium_books_credits", "voice_does_not_exist", "voice_design_free_not_allowed", "no_anonymous", "no_such_document", "license_not_found", "license_expired", "subscription_required", "read_not_found", "audio_file_not_found", "rate_limited", "read_suspended", "read_not_purchased", "device_limit_reached", "not_audiobook", "unusual_activity_detected", "stream_position_outside_of_text", "model_access_denied", "payment_required", "content_against_policy", "famous_voice_not_permitted", "ivc_not_permitted", "voice_not_fine_tuned", "only_for_creator_plus", "free_users_not_allowed", "reader_content_not_permitted", "voice_blocked_detected", "user_in_probation", "detected_unusual_activity", "empty_document", "territory_restricted"});

    public static final Set<String> getPERMANENT_API_ERRORS() {
        return PERMANENT_API_ERRORS;
    }
}
