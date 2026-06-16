package io.elevenlabs.domain.exceptions;

import io.elevenlabs.domain.ApiException;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0016\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003¨\u0006\u0005"}, d2 = {"apiExceptionFor", "Lio/elevenlabs/domain/ApiException;", "code", "", "message", "domain"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class ApiExceptionFactoryKt {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x002c, code lost:
    
        return new io.elevenlabs.domain.exceptions.ContentLicenseException(r9, r8, null, 4, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001f, code lost:
    
        if (r8.equals("license_not_found") == false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0035, code lost:
    
        if (r3.equals("read_not_found") == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0049, code lost:
    
        return new io.elevenlabs.domain.exceptions.NotFoundException(r2, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0041, code lost:
    
        if (r3.equals("audio_file_not_found") == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0016, code lost:
    
        if (r8.equals("license_expired") == false) goto L4;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000a. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final ApiException apiExceptionFor(String str, String str2) {
        String str3;
        String str4;
        String str5;
        str.getClass();
        str2.getClass();
        switch (str.hashCode()) {
            case -1895435135:
                str3 = str;
                str4 = str2;
                if (str3.equals("subscription_required")) {
                    return new SubscriptionRequiredException(str4);
                }
                str5 = str4;
                return new ApiException(str3, str5, null, 4, null);
            case -1621546084:
                str3 = str;
                str4 = str2;
                break;
            case -911815763:
                str3 = str;
                str4 = str2;
                break;
            case 532208792:
                break;
            case 1192427815:
                break;
            default:
                str3 = str;
                str5 = str2;
                return new ApiException(str3, str5, null, 4, null);
        }
    }
}
