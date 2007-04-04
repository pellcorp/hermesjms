/* 
 * Copyright 2003,2004 Colin Crist
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */

package hermes;

/**
 * Thrown when a browse has been interrupted due to some error
 * 
 * @author colincrist@hermesjms.com
 * @version $Id: BrowseInterruptedException.java,v 1.1 2004/05/01 15:52:22
 *          colincrist Exp $
 */

public class BrowseInterruptedException extends HermesException
{
    /**
	 * Comment for <code>serialVersionUID</code>
	 */
	private static final long serialVersionUID = 1L;

	/**
     * BrowseInterruptedException constructor comment.
     * 
     * @param ex
     *            java.lang.Exception
     */
    public BrowseInterruptedException(Exception ex)
    {
        super(ex);
    }

    /**
     * BrowseInterruptedException constructor comment.
     * 
     * @param arg1
     *            java.lang.String
     */
    public BrowseInterruptedException(String arg1)
    {
        super(arg1);
    }

    /**
     * BrowseInterruptedException constructor comment.
     * 
     * @param arg1
     *            java.lang.String
     * @param ex
     *            java.lang.Exception
     */
    public BrowseInterruptedException(String arg1, Exception ex)
    {
        super(arg1, ex);
    }

   
}