// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0;

import com.pulumi.auth0.Utilities;
import com.pulumi.auth0.inputs.GetClientArgs;
import com.pulumi.auth0.inputs.GetClientPlainArgs;
import com.pulumi.auth0.inputs.GetGlobalClientArgs;
import com.pulumi.auth0.inputs.GetGlobalClientPlainArgs;
import com.pulumi.auth0.outputs.GetClientResult;
import com.pulumi.auth0.outputs.GetGlobalClientResult;
import com.pulumi.auth0.outputs.GetTenantResult;
import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import com.pulumi.resources.InvokeArgs;
import java.util.concurrent.CompletableFuture;

public final class Auth0Functions {
    /**
     * Data source to retrieve a specific Auth0 Application client by &#39;client_id&#39; or &#39;name&#39;
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.auth0.Auth0Functions;
     * import com.pulumi.auth0.inputs.GetClientArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var some-client-by-name = Auth0Functions.getClient(GetClientArgs.builder()
     *             .name(&#34;Name of my Application&#34;)
     *             .build());
     * 
     *         final var some-client-by-id = Auth0Functions.getClient(GetClientArgs.builder()
     *             .clientId(&#34;abcdefghkijklmnopqrstuvwxyz0123456789&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetClientResult> getClient() {
        return getClient(GetClientArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * Data source to retrieve a specific Auth0 Application client by &#39;client_id&#39; or &#39;name&#39;
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.auth0.Auth0Functions;
     * import com.pulumi.auth0.inputs.GetClientArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var some-client-by-name = Auth0Functions.getClient(GetClientArgs.builder()
     *             .name(&#34;Name of my Application&#34;)
     *             .build());
     * 
     *         final var some-client-by-id = Auth0Functions.getClient(GetClientArgs.builder()
     *             .clientId(&#34;abcdefghkijklmnopqrstuvwxyz0123456789&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetClientResult> getClientPlain() {
        return getClientPlain(GetClientPlainArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * Data source to retrieve a specific Auth0 Application client by &#39;client_id&#39; or &#39;name&#39;
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.auth0.Auth0Functions;
     * import com.pulumi.auth0.inputs.GetClientArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var some-client-by-name = Auth0Functions.getClient(GetClientArgs.builder()
     *             .name(&#34;Name of my Application&#34;)
     *             .build());
     * 
     *         final var some-client-by-id = Auth0Functions.getClient(GetClientArgs.builder()
     *             .clientId(&#34;abcdefghkijklmnopqrstuvwxyz0123456789&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetClientResult> getClient(GetClientArgs args) {
        return getClient(args, InvokeOptions.Empty);
    }
    /**
     * Data source to retrieve a specific Auth0 Application client by &#39;client_id&#39; or &#39;name&#39;
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.auth0.Auth0Functions;
     * import com.pulumi.auth0.inputs.GetClientArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var some-client-by-name = Auth0Functions.getClient(GetClientArgs.builder()
     *             .name(&#34;Name of my Application&#34;)
     *             .build());
     * 
     *         final var some-client-by-id = Auth0Functions.getClient(GetClientArgs.builder()
     *             .clientId(&#34;abcdefghkijklmnopqrstuvwxyz0123456789&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetClientResult> getClientPlain(GetClientPlainArgs args) {
        return getClientPlain(args, InvokeOptions.Empty);
    }
    /**
     * Data source to retrieve a specific Auth0 Application client by &#39;client_id&#39; or &#39;name&#39;
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.auth0.Auth0Functions;
     * import com.pulumi.auth0.inputs.GetClientArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var some-client-by-name = Auth0Functions.getClient(GetClientArgs.builder()
     *             .name(&#34;Name of my Application&#34;)
     *             .build());
     * 
     *         final var some-client-by-id = Auth0Functions.getClient(GetClientArgs.builder()
     *             .clientId(&#34;abcdefghkijklmnopqrstuvwxyz0123456789&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetClientResult> getClient(GetClientArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("auth0:index/getClient:getClient", TypeShape.of(GetClientResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Data source to retrieve a specific Auth0 Application client by &#39;client_id&#39; or &#39;name&#39;
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.auth0.Auth0Functions;
     * import com.pulumi.auth0.inputs.GetClientArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var some-client-by-name = Auth0Functions.getClient(GetClientArgs.builder()
     *             .name(&#34;Name of my Application&#34;)
     *             .build());
     * 
     *         final var some-client-by-id = Auth0Functions.getClient(GetClientArgs.builder()
     *             .clientId(&#34;abcdefghkijklmnopqrstuvwxyz0123456789&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetClientResult> getClientPlain(GetClientPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("auth0:index/getClient:getClient", TypeShape.of(GetClientResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Retrieves a tenant&#39;s global Auth0 Application client.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.auth0.Auth0Functions;
     * import com.pulumi.auth0.inputs.GetGlobalClientArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var global = Auth0Functions.getGlobalClient();
     * 
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetGlobalClientResult> getGlobalClient() {
        return getGlobalClient(GetGlobalClientArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * Retrieves a tenant&#39;s global Auth0 Application client.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.auth0.Auth0Functions;
     * import com.pulumi.auth0.inputs.GetGlobalClientArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var global = Auth0Functions.getGlobalClient();
     * 
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetGlobalClientResult> getGlobalClientPlain() {
        return getGlobalClientPlain(GetGlobalClientPlainArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * Retrieves a tenant&#39;s global Auth0 Application client.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.auth0.Auth0Functions;
     * import com.pulumi.auth0.inputs.GetGlobalClientArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var global = Auth0Functions.getGlobalClient();
     * 
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetGlobalClientResult> getGlobalClient(GetGlobalClientArgs args) {
        return getGlobalClient(args, InvokeOptions.Empty);
    }
    /**
     * Retrieves a tenant&#39;s global Auth0 Application client.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.auth0.Auth0Functions;
     * import com.pulumi.auth0.inputs.GetGlobalClientArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var global = Auth0Functions.getGlobalClient();
     * 
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetGlobalClientResult> getGlobalClientPlain(GetGlobalClientPlainArgs args) {
        return getGlobalClientPlain(args, InvokeOptions.Empty);
    }
    /**
     * Retrieves a tenant&#39;s global Auth0 Application client.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.auth0.Auth0Functions;
     * import com.pulumi.auth0.inputs.GetGlobalClientArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var global = Auth0Functions.getGlobalClient();
     * 
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetGlobalClientResult> getGlobalClient(GetGlobalClientArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("auth0:index/getGlobalClient:getGlobalClient", TypeShape.of(GetGlobalClientResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Retrieves a tenant&#39;s global Auth0 Application client.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.auth0.Auth0Functions;
     * import com.pulumi.auth0.inputs.GetGlobalClientArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var global = Auth0Functions.getGlobalClient();
     * 
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetGlobalClientResult> getGlobalClientPlain(GetGlobalClientPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("auth0:index/getGlobalClient:getGlobalClient", TypeShape.of(GetGlobalClientResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to access information about the tenant this provider is configured to access.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.auth0.Auth0Functions;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var current = Auth0Functions.getTenant();
     * 
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetTenantResult> getTenant() {
        return getTenant(InvokeArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * Use this data source to access information about the tenant this provider is configured to access.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.auth0.Auth0Functions;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var current = Auth0Functions.getTenant();
     * 
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetTenantResult> getTenantPlain() {
        return getTenantPlain(InvokeArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * Use this data source to access information about the tenant this provider is configured to access.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.auth0.Auth0Functions;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var current = Auth0Functions.getTenant();
     * 
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetTenantResult> getTenant(InvokeArgs args) {
        return getTenant(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to access information about the tenant this provider is configured to access.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.auth0.Auth0Functions;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var current = Auth0Functions.getTenant();
     * 
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetTenantResult> getTenantPlain(InvokeArgs args) {
        return getTenantPlain(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to access information about the tenant this provider is configured to access.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.auth0.Auth0Functions;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var current = Auth0Functions.getTenant();
     * 
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetTenantResult> getTenant(InvokeArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("auth0:index/getTenant:getTenant", TypeShape.of(GetTenantResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to access information about the tenant this provider is configured to access.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.auth0.Auth0Functions;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var current = Auth0Functions.getTenant();
     * 
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetTenantResult> getTenantPlain(InvokeArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("auth0:index/getTenant:getTenant", TypeShape.of(GetTenantResult.class), args, Utilities.withVersion(options));
    }
}